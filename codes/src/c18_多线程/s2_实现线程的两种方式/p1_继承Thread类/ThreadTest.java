package c18_多线程.s2_实现线程的两种方式.p1_继承Thread类;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * 完成线程真正功能的代码放在类的run()方法中
 * 使用start()访求启动线程
 */
public class ThreadTest extends Thread {
    private int count = 10;
    @Override
    public void run() {
        while (true) {
            System.out.print(count + " ");
            if(--count == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();
    }
}
