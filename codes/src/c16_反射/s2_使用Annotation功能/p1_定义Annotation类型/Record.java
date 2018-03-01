package c16_反射.s2_使用Annotation功能.p1_定义Annotation类型;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Record {
    @Field_Method_Parameter_Annotation(describe = "编号", type = int.class)
    int id;
    @Field_Method_Parameter_Annotation(describe = "姓名", type = String.class)
    String name;

    @Constructor_Annotation()
    public Record() {

    }

    @Constructor_Annotation("立即初始化构造方法")
    public Record(
            @Field_Method_Parameter_Annotation(describe = "编号", type = int.class)
                    int id,
            @Field_Method_Parameter_Annotation(describe = "姓名", type = String.class)
                            String name
    ) {
        this.id = id;
        this.name = name;
    }

    @Field_Method_Parameter_Annotation(describe = "获得编号", type = int.class)
    public int getId() {
        return id;
    }

    @Field_Method_Parameter_Annotation(describe = "设置编号")
    public void setId(@Field_Method_Parameter_Annotation(describe = "编号", type = int.class) int id) {
        this.id = id;
    }

    public static void main(String[] args) {

    }
}
