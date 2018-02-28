package c10_接口继承与多态.s5_方法的重载;

/**
 * Created by Administrator on 2018-02-27.
 */

/**
 * 编译器是利用方法名、方法各参数类型和参数的个数以及参数的顺序
 * 来确定类中的方法是否唯一。
 */
public class OverLoadTest {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a) {
        return a;
    }

    public static int add(int a, double b) {
        return 1;
    }

    public static int add(double b, int a) {
        return 2;
    }

    public static int add(int...a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
    }
}
