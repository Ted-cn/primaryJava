package c12_异常处理.s7_练习;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Student {
    public static void speak(int m) throws MyException {
        if(m > 1000) {
            throw new MyException("太大了");
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        Student s = new Student();
        try {
            //s.speak(1000);
            s.speak(1001);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
