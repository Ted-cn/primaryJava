package c5_字符串.s5_格式化字符串.p1_日期和时间字符串格式化;

import java.util.Date;

/**
 * Created by Administrator on 2018/2/26.
 */
public class Eval {
    public static void main(String[] args) {
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td",date);
        System.out.println("今年是：" + year + "年");
        System.out.println("现在是：" + month);
        System.out.println("今天是：" + day + "号");
    }
}
