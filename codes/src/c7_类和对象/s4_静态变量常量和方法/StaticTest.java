package c7_类和对象.s4_静态变量常量和方法;

/**
 * Created by Administrator on 2018-02-27.
 */
public class StaticTest {

    /**
     * 被声明为static的变量，常量，和方法被称为静态成员。
     * 静态成员属于类所有，区别于个别对象，
     * 可以在本类或其他类使用类名和“.”运算符调用静态成员
     */

    /**
     * 规定：
     * 在静态方法中不可以使用this关键字
     * 在静态方法中不可以直接调用非静态方法
     */

    /**
     * 技巧：
     * 如果在执行类时，希望先执行类的初始化动作，
     * 可以使用static定义一个静态区域：
     * static {
     *
     * }
     */
    final static double PI = 3.1415; //在类中定义静态常量
    static int id;

    public static void method1() { //在类中定义静态方法
        //do Something
    }

    public static void main(String[] args) {

    }
}
