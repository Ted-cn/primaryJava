package c17_枚举类与泛型.s2_泛型.p3_泛型的常规用法;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018-02-28.
 */
//1.定义泛型类时声明多个类型
//MutiOverClass<Boolean, Float> over = new MutiOverClass<>();

//2.定义泛型类时声明数组类型
class ArrayClass<T> {
    private T[] array;
    public void setArray(T[] array) {
        this.array = array;
    }
    public T[] getArray() {
        return array;
    }
}

//3.集合类声明容器的元素
class MutiOverClass<K,V> {
    public Map<K,V> m = new HashMap<K,V>();
    public void put(K k, V v) {
        m.put(k,v);
    }
    public V get(K k) {
        return m.get(k);
    }
}


public class Usage {
    public static void main(String[] args) {
        ArrayClass<Integer> a = new ArrayClass<>();
        Integer[] arr = {1,2,3};
        a.setArray(arr);
        System.out.println(Arrays.toString(a.getArray()));

        MutiOverClass<Integer, String> mu = new MutiOverClass<>();
        for (int i = 0; i < 5; i++) {
            mu.put(i, "成员" + i);
        }

        for (int i = 0; i < mu.m.size(); i++) {
            System.out.println(mu.get(i));
        }
    }
}
