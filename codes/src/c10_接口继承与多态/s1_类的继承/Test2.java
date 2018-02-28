package c10_接口继承与多态.s1_类的继承;

/**
 * Created by Administrator on 2018-02-27.
 */
public class Test2 extends Test {
    public Test2() {
        super();
        super.doSomething();
    }

    public void doSomethingNew() {
        //someSentence
    }

    /**
     * 当重写方法时，修改方法的修饰权限只能从小的范围到大的范围改变。
     */
    public void doSomething() {
        //someNewSentence
    }

    /**
     * 子类重写父类的方法可以修改方法的返回值类型，
     * 但这只是在J2SE5.0以上的版本中支持的新功能。
     * 一个原则：
     *   重写的返回值类型必须是父类中同一方法返回值类型的子类
     * @return
     */
    protected Test2 doIt() {
        return new Test2();
    }

    public static void main(String[] args) {
        Test test = new Test2();
        Test2 test2 = (Test2) new Test();
    }
}
