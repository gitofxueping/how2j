package middle.streamofio;

import java.io.*;

//字符流
/* Reader字符输入流
   Writer字符输出流
   专门用于字符的形式读取和写入数据 */
public class Test5 {
    public static void main(String[] args) {
        method1(); //使用字符流读取文件
        method2(); //使用字符流把字符串写入到文件
    }

    //使用字符流读取文件,FileReader 是Reader子类，以FileReader 为例进行文件读取
    public static void method1(){
        // 准备文件lol.txt其中的内容是AB
        File f = new File("d:/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用字符流把字符串写入到文件，FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
    public static void method2(){
        // 准备文件lol2.txt
        File f = new File("d:/lol2.txt");
        // 创建基于文件的Writer
        try (FileWriter fr = new FileWriter(f)) {
            // 以字符流的形式把数据写入到文件中
            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            fr.write(cs);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
