package c8_包装类.s1_Integer;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * java.lang包中的Integer类、Long类和Short类，
 * 分别将基本类型int、long、short封装成一个类。
 * 他们都是Number的子类
 *
 * Integer类在对象中包装了一个基本类型int的值。
 * 该类的对象包含一个int类型的字段。
 */
public class Summation {
    public static void main(String[] args) {
        String[] str = {"89","12","10","18","35"};
        int sum = 0;
        for (String s : str) {
            int myint = Integer.parseInt(s);
            sum += myint;
        }
        System.out.println("数组中各元素之和是：" + sum);
    }
}
