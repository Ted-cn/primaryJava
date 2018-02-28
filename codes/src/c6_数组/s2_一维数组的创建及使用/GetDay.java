package c6_数组.s2_一维数组的创建及使用;

/**
 * Created by Administrator on 2018-02-24.
 */
public class GetDay {
    public static void main(String[] args) {
        int[] day = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++) {
            System.out.println(i +1 +"月有" + day[i] + "天");
        }
    }
}
