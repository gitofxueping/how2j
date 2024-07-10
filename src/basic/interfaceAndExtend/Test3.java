package basic.interfaceAndExtend;

//super
/*子类使用关键字super 显式调用父类带参构造方法
通过super调用父类属性
通过super调用父类方法   */
public class Test3 {

    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        method5();
    }

    /** 准备一个显式提供无参构造方法的父类 */
    public static void method1(){
        new Parent();
    }

    /** 实例化子类，父类的构造方法一定会被调用，并且是父类构造方法先调用，子类构造方法会默认调用父类的无参的构造方法 */
    /*public static void method2(){
        new Children();
    }*/

    /** 子类使用关键字super 显式调用父类带参构造方法 */
    public static void method3(){
        new Children("张三");
    }

    /** 通过super调用父类属性 */
    public static void method4(){
        Children h= new Children();
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
    }

    /** 通过super调用父类方法 */
    public static void method5(){
        Children h= new Children();
        Item i = new Item();
        h.useItem(i);
    }

}
