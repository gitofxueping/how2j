package middle.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//异常
public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {

        File f= new File("d:/LOL.exe");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        new FileInputStream(f);

    }
}
