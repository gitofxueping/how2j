package middle.jdbc;

import java.sql.*;

//PreparedStatement预编译
public class Test2 {
    public static void main(String[] args) {
        method1();//PreparedStatement预编译
    }

    //PreparedStatement预编译
     /*PreparedStatement 的优点
       (1)PreparedStatement 使用参数设置，可读性好，不易犯错；
          Statement 需要进行字符串拼接，可读性和维护性比较差
       (2)PreparedStatement有预编译机制，性能比Statement更快
       (3)PreparedStatement的优点3-防止SQL注入式攻击*/
    public static void method1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
             // 根据sql语句创建PreparedStatement
             PreparedStatement ps = c.prepareStatement(sql);
        ) {

            // 设置参数
            ps.setString(1, "唐僧");
            ps.setFloat(2, 313.0f);
            ps.setInt(3, 50);
            // 执行
            ps.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
