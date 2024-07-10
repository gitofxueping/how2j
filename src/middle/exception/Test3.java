package middle.exception;

//异常分类

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*异常分类： 可查异常，运行时异常和错误3种
其中，运行时异常和错误又叫非可查异常
1.可查异常：必须进行处理的异常(要么try catch处理,要么throws往外抛)，如果不处理，编译不通过。
2.运行时异常RuntimeException指： 即便不进行try catch，也不会有编译错误
  常见运行时异常:
    除数不能为0异常:ArithmeticException
    下标越界异常:ArrayIndexOutOfBoundsException
    空指针异常:NullPointerException
3.错误Error:系统级别的异常，通常是内存用光，不要求强制捕捉的*/

public class Test3 {

    public static void main(String[] args) {
        //method1(); //可查异常
        //method2(); //运行时异常
        //method3(); //错误Error

    }

    /** 可查异常：必须进行处理的异常 */
    public static void method1(){
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

    /** 运行时异常：即便不进行try catch，也不会有编译错误 */
    public static void method2(){
        //任何除数不能为0:ArithmeticException
        int k = 5/0;

        //下标越界异常：ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;

        //空指针异常：NullPointerException
        String str = null;
        str.length();
    }

    /** 错误Error：指的是系统级别的异常，通常是内存用光 */
    public static void method3(){

        //如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append('a');
        }
    }

}
