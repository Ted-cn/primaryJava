package c7_类和对象.s6_对象.p4_对象的比较;

/**
 * Created by Administrator on 2018-02-27.
 */
public class Compare {
    public static void main(String[] args) {
        String c1 = new String("abc"); //创建两个String型对象引用
        String c2 = new String("abc");
        //这里要注意 String c1 = "abc",String c2 = "abc"
        //是将字符串“abc”放入常量池中，所以c1 == c2
        String c3 = c1; //将c1对象的引用赋予c3
        //使用“==”运算符比较c2与c3
        System.out.println("c2 == c3?" + (c2 == c3));  //false

        //使用equals()方法比较
        System.out.println("c2.equals(c3)?" + (c2.equals(c3))); //true

        /**
         * equals()方法用于比较两个对象引用所指的内容是否相等
         * == 比较的是两个对象引用的地址是否相等
         * 由于c1、c2是两个不同的对象引用，两者在内存中的位置不同
         */
    }
}
