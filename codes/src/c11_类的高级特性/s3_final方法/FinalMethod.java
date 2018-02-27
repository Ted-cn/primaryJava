package c11_类的高级特性.s3_final方法;

/**
 * Created by Administrator on 2018/2/27.
 */

/**
 * 1.final方法不能被重写
 * 2.final方法执行效率高于非final方法
 * 3.private方法因为无法被子类访问，更不能重写，所以隐式地被指定为final类型
 */

class Parent {
    private final void doit() {
        System.out.println("父类.doit()");
    }
    final void doit2() {
        System.out.println("父类.doit2()");
    }
    public void doit3() {
        System.out.println("父类.doit3()");
    }
}

class Sub extends Parent {
    public final void doit() {  //在子类中定义一个doit()方法
        System.out.println("子类.doit()");
    }

    //final void doit2() {  //final方法不能重载
    //    System.out.println("子类.doit2()");
    //}

    public void doit3() {
        System.out.println("子类.doit3()");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit();
        Parent p = s;
        //p.doit();  不能调用private()方法
        p.doit2();
        p.doit3();
    }
}
