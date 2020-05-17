package com.test;

import org.junit.jupiter.api.Test;

/**
 * @author qianhao
 * @create 2020/5/9-9:28
 */
public class Test123 {

    @Test
    public void test1() {
        Class clazz =  String.class;
        Class clazz2 = String.class;
        System.out.println(clazz == clazz2);
    }
}
