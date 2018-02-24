package c06_数组.s4_数组的基本操作.p5_数组查询;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Search {
    public static void main(String[] args) {
        int[] arr = new int[]{4,25,8,10};
        Arrays.sort(arr);
        //fromIndex toIndex
        int index = Arrays.binarySearch(arr, 0, 3, 8);
        System.out.println(index);
    }
}
