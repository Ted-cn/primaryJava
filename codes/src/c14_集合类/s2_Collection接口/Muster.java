package c14_集合类.s2_Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Administrator on 2018/2/25.
 */
public class Muster {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
