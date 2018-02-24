package c15_IO.s7_ZIP压缩输入输出流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Decompressing {
    public static void main(String[] args) {
        //压缩文件
        File file = new File("E://hello.zip");
        //创建ZipInputStream对象
        ZipInputStream zin;
        try {
            //创建压缩文件对象
            ZipFile zipFile = new ZipFile(file);
            //实例化对象，指明要进行解压的文件
            zin = new ZipInputStream(new FileInputStream(file));
            //跳过根目录，获取下一个ZipEntry
            ZipEntry entry = zin.getNextEntry();
            while(((entry = zin.getNextEntry()) != null) && !entry.isDirectory()) {
                //解压出的文件路径
                File temp = new File("E://" + entry.getName());
                //如果不存在
                if(!temp.exists()) {
                    temp.getParentFile().mkdirs();
                    OutputStream os = new FileOutputStream(temp);
                    //用输入流读取压缩文件中制定目录中的文件
                    InputStream in = zipFile.getInputStream(entry);
                    int count = 0;
                    while((count = in.read()) != -1) {
                        os.write(count);
                    }
                    os.close();
                    in.close();
                }
                zin.closeEntry();
                System.out.println(entry.getName() + "解压成功");
            }
            zin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
