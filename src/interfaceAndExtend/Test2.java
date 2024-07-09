package interfaceAndExtend;

//多态:操作符的多态和类的多态
public class Test2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    /** 操作符的多态 */
    public static void method1(){
        int i = 5;
        int j = 6;
        int k = i+j; //如果+号两侧都是整型，那么+代表 数字相加
        System.out.println(k);

        int a = 5;
        String b = "6";
        String c = a+b; //如果+号两侧，任意一个是字符串，那么+代表字符串连接
        System.out.println(c);
    }

    /** 类的多态 */
    public static void method2(){
        /*要实现类的多态，需要如下条件
        1. 父类（接口）引用指向子类对象
        2. 调用的方法有重写*/

        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
    }
}
