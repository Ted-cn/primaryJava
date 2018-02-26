package c4_流程控制.s4_循环控制.p1_break语句;

/**
 * Created by Administrator on 2018/2/26.
 */

/**
 * 对于循环嵌套的情况，
 * break语句将只会使程序流程跳出包含它的最内层循环结构，
 * 只跳出一层循环
 */
public class BreakInsideNested {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if(j == 4) {
                    break;
                }
                System.out.println("i="+i+"j="+j);
            }
        }
    }
}
