package middle.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//引用方法
public class Test2 {

    public static void main(String[] args) {
        method1();//引用静态方法
        method2();//引用对象方法
        method3();//引用容器中的对象的方法
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }

    public static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }
    /** 引用静态方法 */
    public static void method1(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        HeroChecker c = new HeroChecker() {
            public boolean test(Hero h) {
                return h.hp>100 && h.damage<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heros, c);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.damage<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> Test2.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, Test2::testHero);
    }

    public boolean testHeroObject(Hero h) {
        return h.hp>100 && h.damage<50;
    }
    /** 引用对象方法 :传递方法的时候，需要一个对象的存在*/
    public static void method2(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        System.out.println("使用引用对象方法  的过滤结果：");
        //使用类的对象方法,因为传递方法的时候，需要一个对象的存在
        Test2 testLambda = new Test2();
        filter(heros, testLambda::testHeroObject);
    }

    /** 引用容器中的对象的方法 */
    public static void method3(){
        //*首先为Hero添加一个方法:public boolean matched()

        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        System.out.println("Lambda表达式：");
        filter(heros,h-> h.hp>100 && h.damage<50 );

        System.out.println("Lambda表达式中调用容器中的对象的matched方法：");
        filter(heros,h-> h.matched() );

        System.out.println("引用容器中对象的方法 之过滤结果：");
        filter(heros, Hero::matched);
    }




}
