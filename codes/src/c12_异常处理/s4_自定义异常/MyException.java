package c12_异常处理.s4_自定义异常;

/**
 * Created by Administrator on 2018-02-28.
 */
public class MyException extends Exception {
    public MyException(String ErrorMessage) {
        super(ErrorMessage);
    }
}
