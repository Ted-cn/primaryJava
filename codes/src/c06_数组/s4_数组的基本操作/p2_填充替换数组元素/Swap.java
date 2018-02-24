package c06_数组.s4_数组的基本操作.p2_填充替换数组元素;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Swap {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //全部填充8
        Arrays.fill(arr, 8);
        System.out.println(Arrays.toString(arr));
    }
}
