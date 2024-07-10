package basic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期格式化类: SimpleDateFormat
public class Test2 {

    public static void main(String[] args) throws ParseException {
        method1(); //日期转字符串：format(d)
        method2(); //字符串转日期：parse(str)
    }

    /** 日期转字符串：format(d)  */
    public static void method1(){
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);
    }

    /** 字符串转日期：parse  */
    public static void method2() throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        String str = "2016/1/5 12:12:12";
        Date d = sdf.parse(str);
        System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
    }
}
