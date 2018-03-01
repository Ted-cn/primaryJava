package c16_反射.s2_使用Annotation功能.p1_定义Annotation类型;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * 用来注释构造方法的Annotation
 */
@Target(ElementType.CONSTRUCTOR) //用于构造方法
@Retention(RetentionPolicy.RUNTIME)  //在运行时加载Annotation到JVM中
public @interface Constructor_Annotation {
    //定义一个具有默认值的String型成员
    String value() default "默认构造方法";
}
