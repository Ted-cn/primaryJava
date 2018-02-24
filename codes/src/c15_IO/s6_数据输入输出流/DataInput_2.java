package c15_IO.s6_数据输入输出流;

import java.io.FileInputStream;

/**
 * Created by Administrator on 2018-02-24.
 */
public class DataInput_2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("littleboy.jpg");
            byte[] b = new byte[1024];
            int len = fis.read(b);
            System.out.println(new String(b, 0, len));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {

            }
        }
    }
}
