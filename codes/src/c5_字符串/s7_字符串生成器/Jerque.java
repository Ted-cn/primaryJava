package c5_字符串.s7_字符串生成器;

/**
 * Created by Administrator on 2018/2/26.
 */
public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("String消耗的时间：" + time);

        StringBuilder sb = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("StringBuilder消耗时间：" + time);
    }
}
