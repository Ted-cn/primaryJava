package c17_枚举类与泛型.s2_泛型.p4_泛型的高级用法;

import java.util.List;

/**
 * Created by Administrator on 2018-02-28.
 */

//1.限制泛型可用类型
class LimitClass<T extends List> {

}

//2.使用类型通配符
//泛型类名称<? extends List>a = null;
//泛型类名称<? super List>a = null;

//3.继承泛型类与实现泛型类

/**
 * 如果在SubClass类继承ExtendClass类时保留父类的泛型类型，
 * 需要在继承时指明，如果没有指明，直接使用extends操作，
 * 则SubClass类中的T1、T2、T3都会自动变成Object，
 * 所以在一般情况下都将父类的泛型类型保留
 *
 */
class ExtendClass<T1> {

}

class SubClass<T1,T2,T3> extends ExtendClass<T1> {

}

public class AdvancedUsage {
    public static void main(String[] args) {

    }
}
