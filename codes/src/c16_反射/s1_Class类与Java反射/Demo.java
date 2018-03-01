package c16_反射.s1_Class类与Java反射;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class c = demo.getClass();
        System.out.println(Arrays.toString(c.getMethods()));
    }
}
