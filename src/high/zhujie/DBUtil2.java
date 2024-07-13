package high.zhujie;

import java.sql.Connection;
import java.sql.DriverManager;

/** 注解方式DBUtil */
/*在一个基于JDBC开发的项目里，都会有一个DBUtil这么一个类，在这个类里统一提供连接数据库的IP地址，端口，数据库名称， 账号，密码，编码方式等信息。
 如在这个DBUtil类里，这些信息，就是以注解的方式定义在类里的。*/

@JDBCConfig(ip ="127.0.0.1",database = "how2java",encoding = "UTF-8",loginName = "root",password = "admin")
public class DBUtil2 {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        //需要解析注解@JDBCConfig
        //通过反射，获取这个DBUtil这个类上的注解对象@JDBCConfig
        JDBCConfig config = DBUtil2.class.getAnnotation(JDBCConfig.class);
        //拿到注解对象之后，通过其方法，获取各个注解元素的值：
        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }

    public static void main(String[] args) throws Exception {
        Connection c = getConnection();
        System.out.println(c);
    }

}
