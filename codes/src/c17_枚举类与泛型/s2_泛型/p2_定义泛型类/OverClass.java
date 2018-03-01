package c17_枚举类与泛型.s2_泛型.p2_定义泛型类;

/**
 * Created by Administrator on 2018-02-28.
 */

/**
 * 类名<T>
 *     T代表一个类型的名称
 * @param <T>
 */
public class OverClass<T> {
    private T over;
    public T getOver() {
        return over;
    }

    public void setOver(T over) {
        this.over = over;
    }

    public static void main(String[] args) {
        OverClass<Boolean> over1 = new OverClass<>();
        over1.setOver(true);
        System.out.println(over1.getOver());
    }
}
