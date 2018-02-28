package c10_接口继承与多态.s3_对象类型的转换.p1_向上转型;

/**
 * Created by Administrator on 2018-02-27.
 */
public class Quadrangle {
    public static void draw(Quadrangle q) {
        //SomeSentence
    }
}

class Parallelogram extends Quadrangle {
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();
        draw(p);
    }
}
