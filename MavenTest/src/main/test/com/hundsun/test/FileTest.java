package com.hundsun.test;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Random;

/**
 * @author shkstart
 * @create 2018/10/27-9:59
 */
public class FileTest {

    @Test
    public void testWriteFile(){
        String[] strarr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int length = strarr.length;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("a.txt");
            for (int i = 0; i <100 ; i++) {
                int num = new Random().nextInt(100);
                System.out.println(num);
                for (int j = 0; j < num; j++) {
                    int random = new Random().nextInt(length);
                    fos.write(strarr[random].getBytes());
                }
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
   public void testCopyFile(){
        copyFileByBufferStream("a.txt","b.txt");
    }

    public void copyFile(String fromFile,String toFile){
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(toFile);
            fis = new FileInputStream(fromFile);
            byte[] bs = new byte[1024];
            int len = 0;
            while((len=fis.read(bs))>0){
                fos.write(bs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null){
                    fis.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyFileByBufferStream(String fromFile,String toFile){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(fromFile));
            bw = new BufferedWriter(new FileWriter(toFile));
            String str = null;
            while ((str=br.readLine())!=null){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCopyFile01() throws IOException {
        File srcFolder = new File("E:\\srcFile");
        File destFolder = new File("E:\\destFile");
        File[] fs = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".java");
            }
        });
        for (File file: fs) {
            File destFile = new File(destFolder,file.getName());
            copyFile(file,destFile);
        }

        File[] destfs = destFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".java");
            }
       });
        for (File f:destfs) {
            File newFile = new File(destFolder,f.getName().replace(".java",".txt"));
            f.renameTo(newFile);
        }
    }


    public void copyWholeFolder(File srcFolder,File destFolder) throws IOException {
        if(destFolder.exists()){
            destFolder.mkdirs();
        }
        if(srcFolder.isFile()){
            File destFile = new File(destFolder,srcFolder.getName());
           copyFile(srcFolder,destFile);
        }else{
            File f = new File(destFolder,srcFolder.getName());
            if(!f.exists()){
                f.mkdirs();
            }
            File[] fs = srcFolder.listFiles();
            for(File file:fs){
                copyWholeFolder(file,f);
            }
        }
    }


    public static void copyFile(File srcFile,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bs = new byte[1024];
        int len = 0;
        while ((len=bis.read(bs))>0){
            bos.write(bs,0,len);
        }
        bis.close();
        bos.close();
    }

    public void copyWholeFolder01(File srcFile,File destFile) throws IOException {
        if(srcFile.isFile()){
            copyFile(srcFile,new File(destFile,srcFile.getName()));
        }else{
            File newFolder = new File(destFile,srcFile.getName());
            newFolder.mkdirs();
            File[] fs = srcFile.listFiles();
            for (File f:fs) {
                copyWholeFolder(f,newFolder);
            }
        }
    }
}
