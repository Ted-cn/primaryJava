package c15_IO.s7_ZIP压缩输入输出流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Administrator on 2018-02-24.
 */
public class MyZip {
    private void zip(String zipFileName, File inputFile) throws Exception {
        //创建ZipOutputStream类对象
        ZipOutputStream zos =
                new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(zos, inputFile, "");
        System.out.println("压缩中");
        zos.close();
    }

    private void zip(ZipOutputStream zos, File f, String base) throws Exception {
        if(f.isDirectory()) {
            File[] fl = f.listFiles();
            if(base.length() != 0) {
                zos.putNextEntry(new ZipEntry(base + "/"));
                for(int i=0;i<fl.length;i++) {
                    zip(zos, fl[i], base + fl[i]);
                }
            } else {
                //创建新的进入点
                zos.putNextEntry(new ZipEntry(base));
                //创建FileInputStream对象
                FileInputStream fis = new FileInputStream(f);
                int b;
                System.out.println(base);
                while((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
            }
        }
    }

    public static void main(String[] args) {
        MyZip book = new MyZip();
        try {
            book.zip("E://hello.zip", new File("E://hello"));
            System.out.println("压缩完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
