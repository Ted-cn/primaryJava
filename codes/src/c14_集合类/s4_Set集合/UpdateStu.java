package c14_集合类.s4_Set集合;

/**
 * Created by Administrator on 2018/2/25.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Set集合中的对象不按特定的方式排序，
 * 只是简单地把对象加入集合中，
 * 但Set集合中不能包含重复对象。
 *
 * 常用实现类：
 * HashSet
 * 实现了Set接口，
 * 由哈希表（实际上是一个HashMap实例）支持。
 * 不保证Set的迭代顺序，特别是它不保证该顺序恒久不变，
 * 允许使用null元素
 *
 * TreeSet
 * 不仅实现了Set接口，还实现了java.util.SortedSet接口，
 * 因此，TreeSet类实现的Set集合在遍历集合时，按照自然排序，
 * 也可以按照指定比较器递增排序。
 */
public class UpdateStu implements Comparable<Object> {
    String name;
    long id;

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu)o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李", 1);
        UpdateStu stu2 = new UpdateStu("陈", 3);
        UpdateStu stu3 = new UpdateStu("王", 4);
        UpdateStu stu4 = new UpdateStu("马", 2);

        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("Set集合中的所有元素：");
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu)it.next();
            System.out.println(stu.getId() + "" + stu.getName());
        }
    }
}
