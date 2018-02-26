package c4_流程控制.s4_循环控制.p2_continue语句;

/**
 * Created by Administrator on 2018/2/26.
 */
public class ContinueOutsideNested {
    public static void main(String[] args) {
        Loop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if(j == 2) continue Loop;
                System.out.println("i=" + i + " " + "j=" + j);
            }
        }
    }
}
