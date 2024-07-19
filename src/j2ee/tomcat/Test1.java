package j2ee.tomcat;

/** Tomcat */
public class Test1 {

/*
  Tomcat是常见的免费的web服务器.
1.Tomcat
  (1)如何启动tomcat
     ①运行批处理文件： D:/tomcat/bin/startup.bat
       最后如果你看到Server startup in xxx ms，就表明启动成功了。
       注:Tomcat启动之后，不要关闭。关闭了就不能访问了。
 （2)如何部署网页
    把test.html 复制到 D:\tomcat\webapps\ROOT 目录下
    就可以通过 http://127.0.0.1:8080/test.html 访问了

2.Tomcat 改端口
  tomcat默认的端口号是8080，可以通过配置把端口号修改成80
  (1)server.xml
     ①tomcat的端口配置相关信息在 D:\tomcat\conf\server.xml中
       <Connector port="8080" protocol="HTTP/1.1"  connectionTimeout="20000" redirectPort="8543" />
     ②把文档中的端口号 8080 改成 80，保存
  (2)重启tomcat
  (3)运行startup.bat
  (4)接着就可以直接通过 http://127.0.0.1/test.html访问网页了。
     80端口就是web服务默认的端口号，所以就不需要显式写这个端口号了。
  (5)80端口被占用
     ①查看80端口被哪些程序占用了
      使用命令:  netstat -ano|findstr "80"
      找到 80 对应的pid(process id) 进程id 号 是”1828”
     ②根据pid（进程id） 查询对应的应用程序
       使用命令:  tasklist|findstr "1828"
       发现是一个java.exe程序占用了80端口
     ③根据pid 结束该程序
       通过pid终止,使用命令： taskkill /f /pid 1828

3.404问题排查
  (1)正确的端口号：确保自己访问的是正确的那个端口号
  (2)环境变量：删除掉环境变量CATALINA_HOME和CATALNIA_BASE
  (3)确定Web应用是否成功启动:
    倘若Web引用启动失败，那么就一定会在Tomcat的logs目录下的 localhost.当前日期.log 里留下错误信息。
    打开这个文件，检查对应的Web应用是否启动过程中报错了
  (4)是否访问对资源了
  (5)不能访问WEB-INF目录下的资源
  (6)访问地址后面多加了一个斜杠
4.持久化异常
5.纯净版Tomcat
6.部署
  (1)下载Tomcat，
 （2)运行Tomcat下的bin目录下的startup.bat
  (3)下载一个J2EE应用
  (4)将J2EE应用解压，比如解压到如下目录：D:\yanfa2023\project\j2ee
    接着用记事本把 前面下载的 tomcat 对应的 conf 目录下的 server.xml文件打开，
    复制本来被注释掉的<Context path="/" docBase="E:\\project\\j2ee\\web" debug="0" reloadable="false" />，
    把复制的docBase的值改成“D:\\yanfa2023\\project\\j2ee\\web”
    注：文件路径是双斜杠
  (5)重启tomcat,并测试。
    关闭tomcat, 并重新运行startup.bat。 然后输入如下网址，看到如图所示的截图，即表示部署成功了。
    输入网址http://127.0.0.1:8080/hello
*/

}
