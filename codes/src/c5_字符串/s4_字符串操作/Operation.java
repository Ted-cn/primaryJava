package c5_字符串.s4_字符串操作;

/**
 * Created by Administrator on 2018/2/26.
 */
public class Operation {
    public static void main(String[] args) {
        String str = " hello world! ";
        //获取子字符串
        int beginIndex = 2;
        int endIndex = 7;
        String subStr1 = str.substring(beginIndex);  //从beginIndex开始
        String subStr2 = str.substring(beginIndex, endIndex); //从beginIndex到endIndex(不含)
        System.out.println("从3开始截取：" + subStr1);
        System.out.println("从3截到7：" + subStr2);

        //去除空格
        str = str.trim(); //忽略前后空格
        System.out.println("去掉首尾空格：" + str);

        //字符串替换
        String repStr = str.replace("he","HE"); //返回值是替换后的字符串，原字符串不变
        System.out.println("替换后：" + repStr);

        //判断字符串的开始与结尾
        str.startsWith(" ");
        str.endsWith(" ");

        //判断字符串是否相等
        /**
         * 对字符串对象进行比较不能简单地使用比较运算符“==”，
         * 因为比较运算符比较的是两个字符串的地址是否相同。
         * 即使两个字符串的内容相同，两个对象的内在地址也是不同的，
         * 使用比较运算符仍然会返回false
         */
        String tom = new String("cat");
        String kitty = new String("cat");
        System.out.println("tom==kitty?" + (tom == kitty));
        System.out.println("tom equals kitty?" + tom.equals(kitty));

        //按字典顺序比较两个字符串
        /**
         * compareTo(String str) 基于Unicode值来比较字符串
         */

        //字母大小写转换
        /**
         * toLowerCase()
         * toUpperCase()
         */

        //字符串分割
        /**
         * split(String sign)
         * split(String sign, int limit) 限制的分割次数
         */
    }
}
