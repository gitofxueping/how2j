package middle.streamofio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//关闭流的方式
public class Test4 {
    public static void main(String[] args) {
        method1(); //在try中关闭
        method2(); //在finally中关闭
        method3(); //使用try()的方式,该方式最便捷
    }

    /** 在try中关闭    */
    public static void method1(){
        /*在try的作用域里关闭文件输入流，这样做有一个弊端；
        如果文件不存在，或者读取的时候出现问题而抛出异常，那么就不会执行这一行关闭流的代码，存在巨大的资源占用隐患。 不推荐使用*/

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

    /** 在finally中关闭 :这是标准的关闭流的方式*/
    /*这是标准的关闭流的方式
      1. 首先把流的引用声明在try的外面，如果声明在try里面，其作用域无法抵达finally.
      2. 在finally关闭之前，要先判断该文件流引用是否为空
      3. 关闭的时候，需要再一次进行try catch处理*/
    public static void method2(){

        File f = new File("d:/lol.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally 里关闭流
            if (null != fis)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /** 使用try()的方式：把流定义在try()里,try,catch或者finally结束的时候，会自动关闭 */
    public static void method3(){
        File f = new File("d:/lol.txt");
        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
