package c4_流程控制.s4_循环控制.p1_break语句;

/**
 * Created by Administrator on 2018/2/26.
 */
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if(i == 6) {
                break;
            }
        }
        System.out.println("---end---");
    }
}
