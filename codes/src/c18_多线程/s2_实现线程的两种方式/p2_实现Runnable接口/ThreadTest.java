package c18_多线程.s2_实现线程的两种方式.p2_实现Runnable接口;

/**
 * Created by Administrator on 2018-02-28.
 */
public class ThreadTest {
    private static Thread t;

    public ThreadTest() {
        t = new Thread(new Runnable() {
            public void run() {
                //具体功能
            }
        });
    }


    public static void main(String[] args) {

    }
}
