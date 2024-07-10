package basic.caozuofu;

import java.util.Scanner;

//算术操作符
public class Test1 {


    public static void main(String[] args) {
        base();

        scannerIntAndLine();

        increment();

    }

    public static void base(){
        /* 算数操作符 基本的有：+ - * / %
           自增 自减 ++ --
        */
        int i = 10;
        int j = 5;
        int a = i+j;
        int b = i - j;
        int c = i*j;
        int d = i /j;
    }

    public static void scannerIntAndLine(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入整数：");
        int m = s.nextInt();
        System.out.println("输入的整数是:"+m);
        System.out.println("请输入字符串:");
        String rn = s.nextLine();
        String n = s.nextLine();
        System.out.println("输入的字符串是："+n);
    }

    public static void increment(){
        int i = 5;
        System.out.println(i++); //输出5
        System.out.println(i);   //输出6

        int j = 5;
        System.out.println(++j); //输出6
        System.out.println(j);   //输出6
    }


}
