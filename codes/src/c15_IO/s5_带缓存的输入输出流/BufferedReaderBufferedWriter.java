package c15_IO.s5_带缓存的输入输出流;

import java.io.*;

/**
 * Created by Administrator on 2018-02-24.
 */
public class BufferedReaderBufferedWriter {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"好久不见", "最近好吗", "常联系"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file); //创建FIleWriter对象
            BufferedWriter bw = new BufferedWriter(fw); //创建BufferedWriter对象
            for(int i = 0;i<content.length;i++) {
                bw.write(content[i]); //写入磁盘文件中
                bw.newLine(); //换行
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while((s=br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
