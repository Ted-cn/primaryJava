package c15_IO.s3_File类;

import java.io.File;

/**
 * Created by Administrator on 2018/2/23.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        if(file.exists()) {
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println(name);
            System.out.println(length);
            System.out.println(hidden);
        } else {
            System.out.println("该文件不存在");
            try {
                //通过createNewFile创建文件
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
