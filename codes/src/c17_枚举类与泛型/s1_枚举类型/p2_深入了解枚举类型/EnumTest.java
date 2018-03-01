package c17_枚举类与泛型.s1_枚举类型.p2_深入了解枚举类型;

/**
 * Created by Administrator on 2018-02-28.
 */
public class EnumTest {
    enum Constant {
        CONSTANT_A(1, "张三"),
        CONSTANT_B(2, "王二");

        private int id;
        private String name;

        private Constant(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constant.values().length; i++) {
            System.out.println(Constant.values()[i].getName());
        }
        System.out.println(Constant.valueOf("CONSTANT_B").getName());
    }
}
