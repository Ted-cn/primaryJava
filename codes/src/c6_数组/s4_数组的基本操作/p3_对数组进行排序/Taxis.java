package c6_数组.s4_数组的基本操作.p3_对数组进行排序;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Taxis {
    public static void main(String[] args) {
        //排序(默认升序)
        int[] arr = new int[]{23,42,12,8};
        //MyComparator cmp = new MyComparator();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
