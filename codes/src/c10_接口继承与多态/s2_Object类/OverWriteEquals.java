package c10_接口继承与多态.s2_Object类;

/**
 * Created by Administrator on 2018-02-27.
 */
class V {

}

public class OverWriteEquals {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1.equals(s2)); //true

        V v1 = new V();
        V v2 = new V();
        System.out.println(v1.equals(v2)); //false
        /**
         * equals()方法默认实现是使用“==”运算符比较两个对象的引用地址，
         * 而不是比较对象的内容，
         * 所以要想真正做到比较两个对象的内容，
         * 需要重写equals()方法
         */
    }
}
