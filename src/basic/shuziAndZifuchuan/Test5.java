package basic.shuziAndZifuchuan;

//字符串:String 被修饰为final,所以是不能被继承的
//字符串的创建,长度
public class Test5 {

    public static void main(String[] args) {
        method1();
        method2();
    }

    /** 创建字符串 */
    public static void method1(){
        /*常见创建字符串手段：
        1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
        2. 调用String的构造方法创建一个字符串对象
        3. 通过+加号进行字符串拼接也会创建新的字符串对象*/

        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String teemo = new String("提莫"); //创建了两个字符串对象

        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);//  通过字符数组创建一个字符串对象
        System.out.println(hero);

        String hero3 = garen + teemo;//  通过+加号进行字符串拼接
        System.out.println(hero3);
    }

    /** 字符串长度:length() */
    public static void method2(){
        String name ="盖伦";
        System.out.println(name.length()); // 长度为2

        String unknowHero = "";
        //可以有长度为0的字符串,即空字符串
        System.out.println(unknowHero.length()); // 长度为0

        String unknowHero2 = " ";
        //可以有长度为0的字符串,即空字符串
        System.out.println(unknowHero2.length()); // 长度为1
    }

}
