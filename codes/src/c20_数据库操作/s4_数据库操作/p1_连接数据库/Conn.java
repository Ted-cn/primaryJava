package c20_数据库操作.s4_数据库操作.p1_连接数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Conn {
    Connection con;  //声明Connection对象

    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  //加载数据库驱动类
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl",
                    "czg",
                    "czg");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Conn c = new Conn();
        c.getConnection();
    }
}
