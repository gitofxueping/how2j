package basic.classAndObject;

//构造方法
public class Test2 {

    public static void main(String[] args) {
       //method1();
       method2();
    }

    /** 构造方法 */
    public static void method1(){
        //实例化一个对象的时候，必然调用构造方法
        Hero h = new Hero();
    }

    /** 隐式的构造方法 */
    public static void method2(){
        //有参的构造方法,类中的 默认无参的构造方法就失效了
        Hero garen =  new Hero("盖伦");

        ADHero teemo =  new ADHero(); //无参的构造方法“木有了”
    }
}
