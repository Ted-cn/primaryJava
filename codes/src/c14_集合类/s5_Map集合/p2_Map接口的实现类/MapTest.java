package c14_集合类.s5_Map集合.p2_Map接口的实现类;

/**
 * Created by Administrator on 2018/2/25.
 */

import java.util.*;

/**
 * Map常用的实现类有HaspMap和TreeMap
 * 建议使用HashMap类实现Map集合，因为添加和删除映射关系效率更高
 *
 * HashMap
 * 基于哈希表的Map接口的实现，此实现提供所有可靠的映射操作，
 * 并允许使用null值和null键，但必须保证键的唯一性。
 * HashMap通过哈希表对其内部的映射关系时行快速查找。
 * 此类不保证映射的顺序，特别是它不保证该顺序恒久不变
 *
 * TreeMap类不仅实现了Map接口，还实现了java.util.SortedMap接口，
 * 因此，集合中的映射关系具有一定的顺序，但在添加、删除和定位映射关系时，
 * TreeMap类性能稍差，不允许键对象是null
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Emp emp1 = new Emp("351","张");
        Emp emp2 = new Emp("512","李");
        Emp emp3 = new Emp("853","王");
        Emp emp4 = new Emp("125","赵");
        Emp emp5 = new Emp("341","黄");

        map.put(emp4.getE_id(), emp4.getE_name());
        map.put(emp5.getE_id(), emp5.getE_name());
        map.put(emp1.getE_id(), emp1.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while (it.hasNext()) {
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> iter = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iter.hasNext()) {
            String str = (String)iter.next();
            String name = (String) treeMap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
