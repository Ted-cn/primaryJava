package c17_枚举类与泛型.s1_枚举类型.p2_深入了解枚举类型;

/**
 * Created by Administrator on 2018-02-28.
 */
public class ShowEnum {
    enum Constants2 {  //将常量旋转在枚举类型中
        Constants_A,
        Constants_B,
    }

    //循环由values()方法返回的数组
    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; i++) {
            System.out.println(Constants2.values()[i]);
        }
    }
}
