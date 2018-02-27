package c11_类的高级特性.s2_final变量;

/**
 * Created by Administrator on 2018/2/27.
 */

import java.util.Random;

/**
 * 1.final关键字可用于变量声明，一旦该变量被设定，就不可以再改变该变量的值
 * 2.通常由final定义的变量为常量，在程序中再次对常量赋值，编译器将不会接受
 * 3.final关键字定义的变量必须在声明时对其进行赋值操作
 * 4.final还可以修饰对象引用，一旦一个对象引用被修饰为final后，它只能恒定指向一个对象。
 * 5.一个static、final的字段只占据一段不能改变的存储空间
 */
class Test {
    int i = 0;
}

public class FinalData {
    static Random rand = new Random();
    private final int VALUE_1 = 9;  //final常量
    private static final int VALUE_2 = 10;  //final、static常量
    private final Test test = new Test();  //final引用
    private Test test2 = new Test();
    private final int[] a = {1,2,3,4,5,6};  //final数组
    private final int i4 = rand.nextInt(20);
    private final int i5 = rand.nextInt(20);

    public String toString() {
        return i4 + " " + i5;
    }

    public static void main(String[] args) {
        FinalData data = new FinalData();
        /**
         * 可以对指定为final的引用中的成员变量赋值，但不能将定义为final的引用指向其他引用
         */
        //data.test = new Test();
        /**
         * 不能改变定义为final的常量值
         */
        //data.VALUE_2++;
        /**
         * 不能对定义为final的数组赋值
         */
        for (int i = 0; i < data.a.length; i++) {
            //a[i] = 9;
        }
    }
}

/**
 * 在Java中定义全局变量，通常使用public static final修饰，这样的常量只能在定义时被赋值
 */
