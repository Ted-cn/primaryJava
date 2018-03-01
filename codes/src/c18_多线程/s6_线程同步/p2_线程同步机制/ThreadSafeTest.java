package c18_多线程.s6_线程同步.p2_线程同步机制;

/**
 * Created by Administrator on 2018-02-28.
 */

//1.同步块
/**
 * 在Java中使用同步机制，可以有效地防止资源冲突。
 * 同步机制使用synchronized关键字
 *
 * 通常将共享资源的操作放置在synchronized定义的区域内，
 * 这样当其他线程也获取到这个锁时，必须等待锁被释放才能进入该区域。
 */
public class ThreadSafeTest implements Runnable {
    int num = 10;
    @Override
    public void run() {
        while (true) {
            synchronized ("") {
                if(num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickeds" + --num);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
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
