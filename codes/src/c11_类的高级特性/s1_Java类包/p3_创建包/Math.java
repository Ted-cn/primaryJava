package c11_类的高级特性.s1_Java类包.p3_创建包;

/**
 * Created by Administrator on 2018/2/27.
 */

/**
 * 为了避免包名冲突，在Java中定义包名时，
 * 通常使用创建者的Internet域名反序，
 * 由于域名是独一无二的，包名自然不会冲突
 */
public class Math {
    public static void main(String[] args) {
        System.out.println("自建的Math类，而不是java.lang.Math类");
    }
}
