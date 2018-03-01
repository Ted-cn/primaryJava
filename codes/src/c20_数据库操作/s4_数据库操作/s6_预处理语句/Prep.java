package c20_数据库操作.s4_数据库操作.s6_预处理语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Administrator on 2018-02-28.
 */
public class Prep {
    static Connection con;
    static PreparedStatement sql;
    static ResultSet res;

    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "czg";
            String password = "czg";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Prep c = new Prep();
        con = c.getConnection();
        try {
            sql = con.prepareStatement("select * from t_emp where empno = ?");
            sql.setInt(1, 7788);
            res = sql.executeQuery();
            while (res.next()) {
                String name = res.getString("ename");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
