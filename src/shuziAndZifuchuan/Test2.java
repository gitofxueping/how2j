package shuziAndZifuchuan;

//数字与字符串转换
public class Test2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    /** 数字 转 字符串 */
    public static void method1(){

        int i = 5;

        //方法1: 使用String类的静态方法valueOf
        String str = String.valueOf(i);

        //方法2: 先把基本类型装箱为对象，然后调用对象的toString
        Integer it = i;
        String str2 = it.toString();
        System.out.println(str2);
    }

    /** 字符串 转 数字: 调用Integer的静态方法parseInt */
    public static void method2(){
        String str = "999";
        int i= Integer.parseInt(str);
        System.out.println(i);
    }
}
