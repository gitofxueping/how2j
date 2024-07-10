package middle.streamofio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流
/*InputStream字节输入流
  OutputStream字节输出流
  用于以字节的形式读取和写入数据*/
public class Test3 {

    public static void main(String[] args) {
        //method1();
        method2();
    }

    /** 以字节流的形式读取文件内容 */
    public static void method1(){
        /* InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
           FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取。 */

        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("d:/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }

            //每次使用完流，都应该进行关闭
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** 以字节流的形式向文件写入数据 */
    public static void method2(){
        /* OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
           FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据。 */

        try {
            /*注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。
            但是如果是文件 d:/qaz/lol2.txt，而目录qaz又不存在，会抛出异常*/

            // 准备文件lol2.txt其中的内容是空的
            File f = new File("d:/qaz/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };

            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
