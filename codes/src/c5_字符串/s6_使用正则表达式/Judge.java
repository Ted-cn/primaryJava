package c5_字符串.s6_使用正则表达式;

/**
 * Created by Administrator on 2018/2/26.
 */
public class Judge {
    public static void main(String[] args) {
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if(str1.matches(regex)) {
            System.out.println(str1 + "是一个合法的E-mail");
        }
        if(str2.matches(regex)) {
            System.out.println(str2 + "是一个合法的E-mail");
        }
        if(str3.matches(regex)) {
            System.out.println(str3 + "是一个合法的E-mail");
        }
    }
}
