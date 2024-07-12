package middle.jdbc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        method1();//Statement的executeQuery 执行SQL查询语句
        //method2();//获取总数 select count(*) from hero
    }

    //Statement的execute 执行SQL查询语句
    public static void method1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {

            String sql = "select * from hero";

            // 执行查询语句，并把结果集返回给ResultSet
            s.execute(sql);
            ResultSet rs = s.getResultSet();


            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //获取总数 select count(*) from hero
    public static void method2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {

            String sql = "select count(*) from hero";

            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next()) {
                total = rs.getInt(1);
            }

            System.out.println("表Hero中总共有:" + total+" 条数据");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
