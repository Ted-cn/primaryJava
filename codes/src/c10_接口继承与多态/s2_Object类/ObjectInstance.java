package c10_接口继承与多态.s2_Object类;

/**
 * Created by Administrator on 2018-02-27.
 */
public class ObjectInstance {

    public String toString() {
        return "在" + getClass().getName() + "类中重写toString()方法";
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());
    }
}
