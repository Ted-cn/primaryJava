package c12_异常处理.s7_练习;

/**
 * Created by Administrator on 2018-02-28.
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        super(message);
    }

    public String getMessage() {
        return message;
    }
}
