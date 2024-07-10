package middle.streamofio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//流就是一系列的数据
/* InputStream字节输入流
   OutputStream字节输出流
   用于以字节的形式读取和写入数据*/
public class Test2 {

    public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
