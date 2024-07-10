package basic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 翻日历:Calendar类即日历类，常用于进行“翻日历”
         add方法，在原日期上增加年/月/日
         set方法，直接设置年/月/日  */
public class Test3 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //日期转成字符串
    private static String format(Date time) {
        return sdf.format(time);
    }

    public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        // 当前日期
        Date now = c.getTime();
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

    }

}
