package c10_接口继承与多态.s1_类的继承;

/**
 * Created by Administrator on 2018-02-27.
 */
public class Parent {
    Parent() {
        System.out.println("调用父类的Parent()构造方法");
    }
}

class SubParent extends Parent {
    SubParent() {
        System.out.println("调用子类的SubParent()构造方法");
    }
}

class Subroutine extends SubParent {
    Subroutine() {
        System.out.println("调用子类的Subroutine()构造方法");
    }

    public static void main(String[] args) {
        Subroutine s = new Subroutine();
    }
}







