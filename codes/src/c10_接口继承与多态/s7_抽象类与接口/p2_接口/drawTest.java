package c10_接口继承与多态.s7_抽象类与接口.p2_接口;

/**
 * Created by Administrator on 2018-02-27.
 */

/**
 * 接口是抽象类的延伸，可以将它看作是纯粹的抽象类
 * 接口中所有方法都没有方法体
 */
public interface drawTest {
    /**
     * 在接口中定义的方法必须被定义为public或abstract形式，
     * 其他修饰权限不被Java编译器认可，
     * 默认public
     */
    /**
     * 接口中定义的任何字段都是static和final的
     */
    void draw();
}
/**
 * Java中不允许多重继承，
 * 但接口可以实现多重继承，
 * 因为一个类可以同时实现多个接口。
 * 这样可以将所有需要继承的接口放置在implements关键字后并使用逗号隔开
 */
