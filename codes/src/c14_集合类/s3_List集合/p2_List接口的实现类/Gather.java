package c14_集合类.s3_List集合.p2_List接口的实现类;

/**
 * Created by Administrator on 2018/2/25.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * List接口实现类有ArrayList和LinkedList
 *
 * ArrayList
 * 实现了可变的数组，
 * 允许保存所有元素，包括null，
 * 并可以根据索引位置对集合进行快速的随机访问；
 * 缺点是向指定的索引位置插入对象或删除对象的速度较慢
 * List<E> list = new ArrayList<E>();
 *
 * LinkedList
 * 采用链表结构保存对象，
 * 这种结构的优点是便于向集合中插入和删除对象，
 * 但对于随机访问集合中的对象，使用起来效率较低
 * List<E> list = new LinkedList<E>();
 */
public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size());
        System.out.println("随机获取数组中的元素：" + list.get(i));
        list.remove(2);
        System.out.println("将索引是‘2’的元素从数组移除后，数组中的元素是：");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
