package c4_流程控制.s4_循环控制.p1_break语句;

/**
 * Created by Administrator on 2018/2/26.
 */
public class BreakOutsideNested {
    public static void main(String[] args) {
        Loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break Loop;
                }
                System.out.println("i="+i+"j="+j);
            }
        }
    }
}
