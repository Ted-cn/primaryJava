package c6_数组.s4_数组的基本操作.p3_对数组进行排序;

import java.util.Comparator;

/**
 * Created by Administrator on 2018-02-24.
 */
public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
