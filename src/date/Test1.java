package date;

import java.util.Date;

//日期对象的创建
public class Test1 {
    public static void main(String[] args) {
        method1();
        method2(); //创建日期对象
        method3(); //getTime：得到一个long型的整数
        method4(); //System.currentTimeMillis()
    }

    /** 时间原点概念  */
    public static void method1(){
        /* Java中的时间原点，其对应的日期是1970年1月1日 8点0分0秒
           所有的日期，都是以为这个0点为基准，每过一毫秒，就+1。*/
    }

    /** 创建日期对象  */
    public static void method2(){
        // 当前时间
        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1);
        System.out.println();

        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("d2为从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);
    }

    /** getTime：得到一个long型的整数  */
    public static void method3(){
        Date now= new Date();
        System.out.println("当前时间:"+now);

        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是："+now.getTime());
    }

    /** 当前日期的毫秒数表达式: new Date().getTime() 和 System.currentTimeMillis()   */
    public static void method4(){
        //当前日期的毫秒数
        System.out.println("Date.getTime() \t\t\t返回值: "+new Date().getTime());
        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
    }
}
