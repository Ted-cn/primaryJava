package c06_数组.s4_数组的基本操作.p1_遍历数组;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Tautog {
    public static void main(String[] args) {
        int[][] arr = {{4,3},{1,2}};
        System.out.println("数组中的元素是：");
        for(int[] x : arr) {
            for(int e : x) {
                System.out.println(e);
            }
        }
    }
}
