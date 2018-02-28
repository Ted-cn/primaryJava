package c10_接口继承与多态.s6_多态;

/**
 * Created by Administrator on 2018-02-27.
 */
public class Quadrangle {
    private Quadrangle[] qtest = new Quadrangle[6];
    private int nextIndex = 0;

    public void draw(Quadrangle q) {
        if (nextIndex < qtest.length) {
            qtest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex ++;
        }
    }

    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();
        q.draw(new Square());
        q.draw(new Parallelotramgle());
    }
}

class Square extends Quadrangle {
    public Square() {
        System.out.println("正方形");
    }
}

class Parallelotramgle extends Quadrangle {
    public Parallelotramgle() {
        System.out.println("平行四边形");
    }
}
