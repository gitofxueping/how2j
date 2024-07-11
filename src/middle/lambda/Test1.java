package middle.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Lambda表达式虽然带来了代码的简洁，但是也有其局限性。
  1. 可读性差，与啰嗦的但是清晰的匿名类代码结构比较起来，Lambda表达式一旦变得比较长，就难以理解
  2. 不便于调试，很难在Lambda表达式中增加调试信息，比如日志
  3. 版本支持，Lambda表达式在JDK8版本中才开始支持，如果系统使用的是以前的版本，考虑系统的稳定性等原因，而不愿意升级，那么就无法使用。

  Lambda比较适合用在简短的业务代码中，并不适合用在复杂的系统中，会加大维护成本。*/

//Lambda
public class Test1 {

    public static void main(String[] args) {
        method1();//匿名类方式
        method2();//Lambda方式
        method3();//从匿名类演变成Lambda表达式
    }

    private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }

    /** 匿名类方式 */
    public static void method1(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };

        filter(heros,checker);
    }

    /** Lambda方式 */
    public static void method2(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.hp>100 && h.damage<50);
    }

    /** 从匿名类演变成Lambda表达式 */
    public static void method3(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        // 匿名类的正常写法
        HeroChecker c1 = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp > 100 && h.damage < 50);
            }
        };
        // 把new HeroChcekcer，方法名，方法返回类型信息去掉
        // 只保留方法参数和方法体
        // 参数和方法体之间加上符号 ->
        HeroChecker c2 = (Hero h) -> {
            return h.hp > 100 && h.damage < 50;
        };

        // 把return和{}去掉
        HeroChecker c3 = (Hero h) -> h.hp > 100 && h.damage < 50;

        // 把 参数类型和圆括号去掉
        HeroChecker c4 = h -> h.hp > 100 && h.damage < 50;

        // 把c4作为参数传递进去
        filter(heros, c4);

        // 直接把表达式传递进去
        filter(heros, h -> h.hp > 100 && h.damage < 50);
    }
}
