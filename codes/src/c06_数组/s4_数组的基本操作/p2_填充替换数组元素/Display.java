package c06_数组.s4_数组的基本操作.p2_填充替换数组元素;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Display {
    public static void main(String[] args) {
        int[] arr = new int[]{45,12,2,10};
        //开始位置1，结束位置2，替换为8
        Arrays.fill(arr, 1, 2, 8);
        System.out.println(Arrays.toString(arr));
    }
}
