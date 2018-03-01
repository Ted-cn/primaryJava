package c17_枚举类与泛型.s1_枚举类型.p2_深入了解枚举类型;

/**
 * Created by Administrator on 2018-02-28.
 */
public class EnumIndexTest {
    enum Constants2 {
        Constants_A("A"),
        Constants_B("B"),
        Constants_C("C"),
        Constants_D(3);

        private String description;
        private int i = 4;
        private Constants2() {

        }

        //定义参数为String型的构造方法
        private Constants2(String description) {
            this.description = description;
        }

        //字义参数为int型的构造方法
        private Constants2(int i) {
            this.i = i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; i++) {
            System.out.println(Constants2.values()[i].getDescription());
        }
        System.out.println(Constants2.valueOf("Constants_D").getI());
    }
}
