package c5_字符串.s2_连接字符串.p2_连接其他数据类型;

/**
 * Created by Administrator on 2018/2/26.
 */
public class Link {
    public static void main(String[] args) {
        /**
         * 将字符串同其他数据类型进行连接，
         * 会自动调用toString()方法，
         * 将这些数据转换成字符串
         */
        int booktime = 4;
        float practice = 2.5f;
        System.out.println("我每天花费" + booktime + "小时看书；" + practice + "小时练习");
    }
}
