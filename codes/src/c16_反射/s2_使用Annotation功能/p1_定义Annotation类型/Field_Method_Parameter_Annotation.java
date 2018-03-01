package c16_反射.s2_使用Annotation功能.p1_定义Annotation类型;

/**
 * Created by Administrator on 2018-02-28.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来注释字段、方法和参数的Annotation
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Field_Method_Parameter_Annotation {
    String describe();
    Class type() default void.class;
}
