package c06_数组.s4_数组的基本操作.p4_复制数组;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Copy {
    public static void main(String[] args) {
        int arr[] = new int[]{23,42,12};
        //复制前5个数，不足补0
        int newArr[] = Arrays.copyOf(arr, 5);
        //复制0-3（不含3）
        //int newArr[] = Arrays.copyOf(arr, 0, 3);
        System.out.println(Arrays.toString(newArr));
    }
}
