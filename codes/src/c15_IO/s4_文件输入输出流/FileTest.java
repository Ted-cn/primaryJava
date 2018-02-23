package c15_IO.s4_文件输入输出流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/2/23.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            //创建FileOutputStream
            FileOutputStream fos = new FileOutputStream(file);
            //创建byte数组
            byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
            fos.write(buy);
            fos.close();

            //创建FileInputStream
            FileInputStream fis = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = fis.read(byt);
            System.out.println("文件中的信息是：" + new String(byt, 0, len));
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
