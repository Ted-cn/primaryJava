package c15_IO.s5_带缓存的输入输出流;

import java.io.*;

/**
 * Created by Administrator on 2018-02-24.
 */
public class Buffered2 {
    public static void main(String[] args) {
        File file = new File("演员.txt");
        String[] lyrics = {"简单点", "说话的方式简单点", "你又不是个演员", "……"};
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String lyric : lyrics) {
                bw.write(lyric);
                bw.newLine();
            }
            bw.close();
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String content;
            while((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
