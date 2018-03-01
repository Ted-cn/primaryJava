package c20_数据库操作.s4_数据库操作.p4_顺序查询;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Gradation {
    static Connection con;
    static Statement sql;
    static ResultSet res;

    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("数据库驱动加载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "czg";
            String password = "czg";
            con = DriverManager.getConnection(url, username, password);
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Gradation c = new Gradation();
        con = c.getConnection();
        try {
            sql = con.createStatement();  //实例化Statement对象
            res = sql.executeQuery("SELECT * FROM T_EMP");
            while (res.next()) {
                String name = res.getString("ename");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
