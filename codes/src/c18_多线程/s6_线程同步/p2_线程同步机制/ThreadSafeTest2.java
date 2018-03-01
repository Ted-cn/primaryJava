package c18_多线程.s6_线程同步.p2_线程同步机制;

/**
 * Created by Administrator on 2018-02-28.
 */

//2.同步方法
/**
 * 同步方法就是在方法前面修饰synchronized关键字的方法
 *
 * 当某个对象调用了同步方法，该对象上的其他同步方法必须等待该同步方法执行完毕后
 * 才能被执行。必须将每个能访问共享资源的方法修饰为syncronized,否则会出错
 */
public class ThreadSafeTest2 implements Runnable {
    private int num = 10;

    @Override
    public void run() {
        while (true) {
            doit();
        }
    }

    public synchronized void doit() {
        if (num > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("tickets" + --num);
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
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
