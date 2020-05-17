package com.github.test.annotiontest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.zip.Deflater;

/**
 * @author qianhao
 * @create 2020/5/8-21:54
 */

/**
 * @Target注解标记所定义注解在哪里使用:
 *      Enum:ElementType类限制
 *          TYPE:用于描述类、接口(包括注解类型) 或enum声明
 *          FIELD: 用于修复类变量
 *          METHOD: 用于类方法
 *          PARAMETER: 用于描述参数
 *          CONSTRUCTOR: 用于构造函数
 *          LOCAL_VARIABLE: 用于修饰局部变量
 *          ANNOTATION_TYPE:修饰注解
 *          PACKAGE: 用于描述包
 *
 *          1.8新加的两个注解属性:
 *              TYPE_PARAMETER:
 *              TYPE_USE:
 *
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.PARAMETER})
/**
 *
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 * 描述在使用 javadoc 工具为类生成帮助文档时是否要保留其注解信息
 */
@Documented
/**
 * 注解具有传承性
 */
@Inherited
public @interface MyAnnotation {

    String key() default "";

    String value() default "";

    String[] arr_prop() default {};
}
