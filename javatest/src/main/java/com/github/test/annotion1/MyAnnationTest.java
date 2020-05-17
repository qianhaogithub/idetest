package com.github.test.annotion1;

import com.github.test.annotiontest.MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author qianhao
 * @create 2020/5/8-22:35
 */
@MyAnnotation(key = "aaa",value = "111",arr_prop = {"aaa","bbb"})
public class MyAnnationTest {
    @MyAnnotation(key = "ggg",value = "222",arr_prop = {"hhh","ttt"})
    private String aaa;

    private String bbb;

    public String ccc;

    private String testAnnotion(@MyAnnotation(value="测试啊") String aaa,String bbb) {
        if(aaa == null) {
            aaa = "";
        }
        return "Hello World!!!" + "===" + aaa;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //testAnation1();
        Class<MyAnnationTest> clazz = MyAnnationTest.class;
        Field[] fields = clazz.getDeclaredFields();//获取所有变量
        Field[] fs2 = clazz.getFields();//获取公用变量(public)
        Method[] methods = clazz.getDeclaredMethods();
        Object[] arguments = null;
        for (Method method : methods) {
            Annotation[][] annotations = method.getParameterAnnotations();
            method.setAccessible(true);
            Class<?>[] parameterTypes = method.getParameterTypes();
            if(parameterTypes.length>0){
                arguments = new Object[parameterTypes.length];
            }

            for (int i = 0; i < annotations.length; i++) {
                for (int j = 0; j < annotations[i].length; j++) {
                    if(annotations[i][j].annotationType().equals(MyAnnotation.class)) {
                        MyAnnotation ma = (MyAnnotation) annotations[i][j];
                        arguments[i] = ma.value();
                    }
                }
            }
            if(method.getName().equals("testAnnotion")) {
                System.out.println(annotations.length);
                System.out.println(method.invoke(clazz.newInstance(), arguments));
            }
        }
        /*for (Field field : fs2) {
            System.out.println(field.getModifiers());
        }
        for (Field field : fields) {
            field.setAccessible(true);
            Annotation[] as = field.getAnnotations();
            System.out.println(777);
            System.out.println(as.length + "===" + field.getName());
            for (Annotation a : as) {
                System.out.println(a);
            }
        }

        System.out.println("============================================================================");

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }*/
    }

    private static void testAnation1() {
        Class<MyAnnationTest> clazz = MyAnnationTest.class;
        MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.key());
        System.out.println(annotation.value());
        String[] sss = annotation.arr_prop();
        System.out.println(Arrays.toString(sss));
    }
}
