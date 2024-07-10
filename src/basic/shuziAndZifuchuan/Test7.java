package basic.shuziAndZifuchuan;

//比较字符串
public class Test7 {

    public static void main(String[] args) {
        method1(); //是否是同一个对象
        method2(); //是否是同一个对象--特例
        method3(); //使用equals进行字符串内容的比较，必须大小写一致
        method4(); //是否以子字符串开始startsWith或者结束endsWith
    }

    /** 是否是同一个对象  */
    public static void method1(){
        String str1 = "the light";
        String str2 = new String(str1);
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2); //false
    }

    /** 是否是同一个对象--特例  */
    public static void method2(){
        /*一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
        所以在第一次时会创建了一个新的字符串"the light"
        但是在第二次，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建*/

        String str1 = "the light";
        String str3 = "the light";
        System.out.println( str1  ==  str3); //true
    }

    /** 内容是否相同:使用equals进行字符串内容的比较，必须大小写一致  */
    public static void method3(){
        String str1 = "the light";

        String str2 = new String(str1);

        String str3 = str1.toUpperCase();

        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2); //false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true
    }

    /** 是否以子字符串开始startsWith或者结束endsWith  */
    public static void method4(){
        String str1 = "the light";
        String start = "the";
        String end = "Ight";

        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束
    }
}
