package c16_反射.s2_使用Annotation功能.p1_定义Annotation类型;

/**
 * Created by Administrator on 2018-02-28.
 */
public @interface DefaultValueAnnotation {
    String describe() default "<默认值>";
    Class type() default void.class;
}
