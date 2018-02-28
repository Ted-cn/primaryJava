package c7_类和对象.s6_对象.p1_对象的创建;

/**
 * Created by Administrator on 2018-02-27.
 */

/**
 * 对象被创建出来时，就是一个对象的引用，
 * 这个引用在内在中为对象分配了存储空间，
 *
 * 每个对象都是相互独立的，在内存中占据独立的内存地址，
 * 并且每个对象都具有自己的生命周期。
 */
public class CreateObject {
    public CreateObject() {
        System.out.println("创建对象");
    }

    public static void main(String[] args) {
        new CreateObject();
    }
}
