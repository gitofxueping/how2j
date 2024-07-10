package middle.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//异常处理常见手段： try catch finally, throws
/*throws与throw有如下区别：
  1. throws 出现在方法声明上，而throw通常都出现在方法体内。
  2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；
     throw则是抛出了异常，执行throw则一定抛出了某个异常对象。*/
public class Test2 {

    public static void main(String[] args) {
        method1(); //try catch
        method2(); //使用异常的父类Exception进行catch
        method3(); //多异常捕捉办法
        method4(); //finally
        method5(); //通过throws把异常抛出给调用方
    }

    /** try catch */
    public static void method1(){
        /*1.将可能抛出FileNotFoundException
        2.如果文件存在，就会顺序往下执行，并且不执行catch块中的代码
        3. 如果文件不存在，try 里的代码会立即终止，程序流程会运行到对应的catch块中
        4. e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException的第28行，这样就便于定位和分析到底哪里出了异常*/

        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
    }

    /** 使用异常的父类Exception进行catch  */
    public static void method2(){
        //FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException
        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }

        catch(Exception e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
    }

    /** 多异常捕捉办法:把多个异常，放在一个catch里统一捕捉,需要通过instanceof 进行判断具体的异常类型 */
    public static void method3(){
        File f = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");

            e.printStackTrace();
        }
    }

    /** finally:无论是否出现异常，finally中的代码都会被执行 */
    public static void method4(){
        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
        finally{
            System.out.println("无论文件是否存在， 都会执行的代码");
        }
    }

    /** throws:不处理异常，通过throws抛出去异常 */
    public static void method5(){
        try {
            method6();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method6() throws FileNotFoundException {
        File f = new File("d:/LOL.exe");
        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");

    }
}
