package c15_IO.s6_数据输入输出流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018-02-24.
 */
public class DataInput_DataOutput {
    public static void main(String[] args) {
        try {
            //创建FileOutputStream对象
            FileOutputStream fos = new FileOutputStream("word.txt");
            //创建DataOutputStream对象
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("使用writeUTF()方法写入数据");
            dos.writeChars("使用writeChars方法写入数据");
            dos.writeBytes("使用writeBytes方法写入数据");
            dos.close();

            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
