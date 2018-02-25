package c14_集合类.s5_Map集合.p1_Map接口;

import java.util.*;

/**
 * Created by Administrator on 2018/2/25.
 */

/**
 * Map集合没有继承Collection接口，
 * 因此没有iterator方法
 * 其提供的是key到value的映射，
 * Map中不能包含相同的key，每个key只能映射一个value。
 *
 */
public class UpdateStu {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01","李");
        map.put("02","魏");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("value集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
