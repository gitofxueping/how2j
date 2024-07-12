package middle.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

//使用事务
/*在事务中的多个操作，要么都成功，要么都失败
  通过 c.setAutoCommit(false);关闭自动提交
  使用 c.commit();进行手动提交*/

/*MYSQL 表的类型必须是INNODB才支持事务
  在Mysql中，只有当表的类型是INNODB的时候，才支持事务，所以需要把表的类型设置为INNODB,否则无法观察到事务.
  修改表的类型为INNODB的SQL：alter table hero ENGINE  = innodb;
  查看表的类型的SQL：show table status from how2java;*/
public class Test5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
             Statement s = c.createStatement();) {

            // 有事务的前提下
            // 在事务中的多个操作，要么都成功，要么都失败
            c.setAutoCommit(false);

            // 加血的SQL
            String sql1 = "update hero set hp = hp +1 where id = 22";
            s.execute(sql1);

            // 减血的SQL
            // 不小心写错写成了 updata(而非update)

            String sql2 = "updata hero set hp = hp -1 where id = 22";
            s.execute(sql2);

            // 手动提交
            c.commit();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
