package c6_数组.s4_数组的基本操作.p5_数组查询;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Example {
    public static void main(String[] args) {
        int ia[] = new int[]{1,8,9,4,5};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia, 0, 1, 10);
        System.out.println(index);
    }
}
