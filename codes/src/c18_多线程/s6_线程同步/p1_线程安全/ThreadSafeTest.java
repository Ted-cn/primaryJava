package c18_多线程.s6_线程同步.p1_线程安全;

/**
 * Created by Administrator on 2018-02-28.
 */
public class ThreadSafeTest implements Runnable {
    int num = 10;//设置当前总票数
    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("tickets " + num--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();  //实例化对象
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
