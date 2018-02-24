package c15_IO.s4_文件输入输出流;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Administrator on 2018/2/23.
 */
public class Ftest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null; //面板对象
    private JTextArea jTextArea = null; //文本域对象
    private JPanel controlPanel = null; //面板对象
    private JButton openButton = null; //按钮对象
    private JButton closeButton = null; //按钮对象

    public JButton getOpenButton() {
        if(openButton == null) {
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                //按钮的单击事件
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try {
                        FileWriter fw = new FileWriter(file);
                        //获取文本域中文本
                        String s = jTextArea.getText();
                        //将信息写入磁盘文件
                        fw.write(s);
                        fw.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }


    public JButton getCloseButton() {
        if(closeButton == null) {
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try {
                        FileReader fr = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = fr.read(byt);
                        jTextArea.setText(new String(byt, 0, len));
                        fr.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    public JTextArea getjTextArea() {
        if(jTextArea == null) {
            jTextArea = new JTextArea();
        }
        return jTextArea;
    }

    public JPanel getControlPanel() {
        if(controlPanel == null) {
            controlPanel = new JPanel();
            controlPanel.add(getOpenButton());
            controlPanel.add(getCloseButton());
        }
        return controlPanel;
    }

    public Ftest() {
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300,200);
        this.setLocation(500,300);
        this.setAlwaysOnTop(true);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    private JPanel getJContentPane() {
        if(jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getjTextArea(), BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public static void main(String[] args) {
        Ftest thisClass = new Ftest();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }

}
