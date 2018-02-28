package c10_接口继承与多态.s3_对象类型的转换.p2_向下转型;

/**
 * Created by Administrator on 2018-02-27.
 */
class Quadrangle {
    public static void draw(Quadrangle q) {
        //someSentence
    }
}

public class Parallelogram extends Quadrangle {
    public static void main(String[] args) {
        draw(new Parallelogram());
        Quadrangle q = new Parallelogram();
        Parallelogram p = (Parallelogram) q;
    }
}
