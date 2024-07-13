package high.fanshejizhi;

import java.net.InetAddress;
import java.net.UnknownHostException;

/** 类对象 */
/* 类对象概念:所有的类，都存在一个类对象，这个类对象用于提供类本身的信息，比如有几种构造方法， 有多少属性，有哪些普通方法。
   获取类对象有3种方式
      1. Class.forName
      2. Hero.class
      3. new Hero().getClass()
     第1和3种方式，，都会导致静态属性被初始化，而且只会执行一次。
     第2种方式，，不会导致静态属性被初始化；
     在一个JVM中，一种类，只会有一个类对象存在。所以以上三种方式取出来的类对象，都是一样的。*/

public class Test1 {

    public static void main(String[] args) {
        method1();//获取类对象
    }

    /** 获取类对象 */
    public static void method1()  {
        String className = "high.fanshejizhi.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);//true
            System.out.println(pClass1==pClass3);//true
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
