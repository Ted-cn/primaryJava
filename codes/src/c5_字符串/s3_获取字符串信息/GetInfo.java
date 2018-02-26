package c5_字符串.s3_获取字符串信息;

/**
 * Created by Administrator on 2018/2/26.
 */
public class GetInfo {
    public static void main(String[] args) {
        String str = "hello world!";
        //获取字符串长度
        System.out.println(str.length());

        //字符串查找
        int index1 = str.indexOf("w");
        int index2 = str.lastIndexOf("w");
        System.out.println(index1);
        System.out.println(index2);

        //获取指定索引位置的字符
        char cha = str.charAt(6);
        System.out.println(cha);
    }
}
