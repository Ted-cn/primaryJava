package c12_异常处理.s5_在方法中抛出异常.使用throw抛出异常;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * throw关键字通常用在方法体中，并且抛出一个异常对象。
 * 程序在执行到throw语句时立即终止，它后面的语句都不执行。
 * 通过throw抛出异常后，如果想在上一级代码中来捕获并处理异常，
 * 则需要在抛出异常的方法中使用throws关键字的方法的声明中指明要抛出的异常；
 * 如果要捕捉throw抛出的异常，则必须使用try-catch语句块。
 *
 */
public class Captor {
    static int quotient(int x, int y) throws MyException {
        if (y < 0 ) {
            throw new MyException("除数不能是负数");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try {
            int result = quotient(3, 0);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("程序发生了其他异常");
        }
    }
}
