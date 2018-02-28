package c11_类的高级特性.s4_final类;

/**
 * Created by Administrator on 2018/2/27.
 */

/**
 * 1.定义为final的类不能被继承
 * 2.如果将某个类设置为final形式，则类中的所有方法都被隐式地设置为final形式，
 *   但是final类中的成员变量可以被定义为final或非final形式。
 */
final class FinalClass {
    int a = 3;
    void doit() {

    }

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.a++;
        System.out.print(f.a);
    }
}
