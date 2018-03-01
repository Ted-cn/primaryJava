package c12_异常处理.s5_在方法中抛出异常.p1_使用throws抛出异常;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * throws关键字通常被应用在声明方法时，用来指定方法可能抛出的异常。
 */
public class Shoot {
    static void pop() throws NegativeArraySizeException {
        //定义方法并抛出NegativeArraySizeException异常
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try {
            pop();
        } catch (NegativeArraySizeException e) {
            System.out.println("pop()方法抛出的异常");
        }
    }
}
