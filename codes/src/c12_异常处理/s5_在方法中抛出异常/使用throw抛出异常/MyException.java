package c12_异常处理.s5_在方法中抛出异常.使用throw抛出异常;

/**
 * Created by Administrator on 2018-02-28.
 */
public class MyException extends Exception {
    String message;

    public MyException(String ErrorMessage) {
        message = ErrorMessage;
    }
    public String getMessage() {
        return message;
    }
}
