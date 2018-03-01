package c17_枚举类与泛型.s2_泛型.p1_回顾向上转型和向下转型;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Test {
    private Object b;
    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setB(new Boolean(true));
        System.out.println(t.getB());

        t.setB(new Float(12.3));
        Float f = (Float) t.getB();
        System.out.println(f);
    }
}
