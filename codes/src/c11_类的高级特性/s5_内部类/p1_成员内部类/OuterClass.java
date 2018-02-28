package c11_类的高级特性.s5_内部类.p1_成员内部类;

/**
 * Created by Administrator on 2018/2/27.
 */

/**
 * 1.可以在内部类中直接存取其所在类的私有成员变量。
 * 2.
 */
public class OuterClass {
    innerClass in = new innerClass();

    public void ouf() {
        in.inf();
    }

    class innerClass {
        innerClass() {
        }
        public void inf() {
        }
        int y = 0;
    }

    public innerClass doit() {
        //y = 4;
        in.y = 4;
        return new innerClass();
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.innerClass in = out.doit();
        OuterClass.innerClass in2 = out.new innerClass();
    }
}
