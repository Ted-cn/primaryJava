package c6_数组.s3_二维数据的创建及使用;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Matrix {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
