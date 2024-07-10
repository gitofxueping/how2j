package basic.interfaceAndExtend;


/*类型转换: 引用类型和对象类型不一致的情况下的转换。
          把一个引用所指向的对象的类型，转换为另一个引用的类型。
①	子类转父类(向上转型)
②	父类转子类(向下转型): 必须进行强制转换。
③	没有继承关系的两个类，互相转换，一定会失败
④	实现类转换成接口(向上转型)
⑤	接口转换成实现类(向下转型): 必须进行强制转换
⑥	instanceof Hero 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类,是则返回true，否则返回false*/

public class Test1 {

    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        method5();
    }

    /** 子类转父类(向上转型) */
    public static void method1(){
        Human h = new Human();

        ADHuman ad = new ADHuman();

        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型
        //把ad引用所指向的对象的类型是ADHuman
        //h引用的类型是Human
        //把ADHuman当做Hero使用，一定可以
        h = ad;
    }

    /** 父类转子类(向下转型) */
    public static void method2(){
        Human h = new Human();
        ADHuman ad = new ADHuman();
        h = ad;

        //父类转子类，必须进行强制转换。
        ad = (ADHuman) h;
    }

    /** 实现类转换成接口(向上转型) */
    public static void method3(){
        ADHuman ad = new ADHuman();
        AD adi = ad;
    }

    /** 接口转换成实现类(向下转型) */
    public static void method4(){
        ADHuman ad = new ADHuman();
        AD adi = ad;
        ADHuman adHero = (ADHuman) adi;
    }

    /** instanceof :判断一个引用所指向的对象，是否是Human类型，或者Human的子类 */
    public static void method5(){
        ADHuman ad = new ADHuman();
        ADAPHuman ap = new ADAPHuman();

        Human h1= ad;
        Human h2= ap;

        //判断引用h1指向的对象，是否是ADHuman类型
        System.out.println(h1 instanceof ADHuman);

        //判断引用h2指向的对象，是否是ADAPHuman类型
        System.out.println(h2 instanceof ADAPHuman);

        //判断引用h1指向的对象，是否是Human的子类型
        System.out.println(h1 instanceof Human);
    }


}
