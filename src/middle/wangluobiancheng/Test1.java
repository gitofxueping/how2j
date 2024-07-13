package middle.wangluobiancheng;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

//ip地址，端口
/*在网络中每台计算机都必须有一个的IP地址；
  127.0.0.1 是固定ip地址，代表当前计算机，相当于面向对象里的 "this"

  两台计算机进行连接，总有一台服务器，一台客户端。
  服务器和客户端之间的通信通过端口进行。*/
public class Test1 {
    public static void main(String[] args) throws IOException {
        method1();// 获取本机IP地址
        method2();// ping命令

    }

    /** 获取本机IP地址 */
    public static void method1() throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }

    /** ping命令：使用java 执行ping命令,判断一个地址是否能够到达 */
    public static void method2() throws IOException {
        Process p = Runtime.getRuntime().exec("ping " + "20.205.243.166");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }

}
