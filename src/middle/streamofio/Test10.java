package middle.streamofio;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*System.out 是常用的在控制台输出数据的
  System.in 可以从控制台输入数据*/
public class Test10 {
    public static void main(String[] args) {
        method1(); //Scanner读取字符串
        method2(); //Scanner从控制台读取整数
    }

    //Scanner读取字符串
    public static void method1(){
        Scanner s = new Scanner(System.in);
        while(true){
            String line = s.nextLine();
            System.out.println(line);
        }

    }

    //Scanner从控制台读取整数
    public static void method2(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }
}
