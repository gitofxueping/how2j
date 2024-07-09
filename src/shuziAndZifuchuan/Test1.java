package shuziAndZifuchuan;

//装箱: 不需要调用构造方法，通过"="符号自动把 基本类型 转换为 类类型
//拆箱: 不需要调用Integer的intValue方法，通过"="符号自动 把 类类型 转换为 基本类型
//char对应的封装类是Character，Character常见方法
public class Test1 {

    /* 所有的基本类型，都有对应的类类型
       比如int对应的类是Integer
       这种类类型就叫做封装类 */

    /* 数字封装类有 Byte,Short,Integer,Long,Float,Double
       这些类都是抽象类Number的子类 */

    /* char对应的封装类是Character */

    public static void main(String[] args) {
        method1(); // 装箱拆箱
        method2(); // Character常见方法
    }

    /** 装箱拆箱 */
    public static void method1(){
        int i = 5;
        Integer it2 = i; //自动装箱
        int i2= it2;  //自动拆箱

        char c1 = 'a';
        Character c = c1; //自动装箱
        c1 = c;//自动拆箱
    }

    /** char对应的封装类是Character，Character常见方法  */
    public static void method2(){
        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace(' ')); //是否是空白
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

        /*String a = 'a'; 不能够直接把一个字符转换成字符串*/
        String a2 = Character.toString('a'); //字符转换为字符串
    }

}
