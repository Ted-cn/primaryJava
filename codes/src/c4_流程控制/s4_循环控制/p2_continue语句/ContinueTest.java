package c4_流程控制.s4_循环控制.p2_continue语句;

/**
 * Created by Administrator on 2018/2/26.
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
