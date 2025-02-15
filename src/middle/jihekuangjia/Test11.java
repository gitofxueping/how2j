package middle.jihekuangjia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

//比较器
public class Test11 {

    public static void main(String[] args) {
        //method1(); //Comparator
        method2();
    }

    /** Comparator   */
    public static void method1(){
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);

        //引入Comparator，指定比较的算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };
        Collections.sort(heros,c);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);
    }

    /** Comparable   */
    public static void method2(){
        Random r =new Random();
        List<People> peoples = new ArrayList<People>();

        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            peoples.add(new People("people "+ i, r.nextInt(100), r.nextInt(100)));
        }

        System.out.println("初始化后的集合");
        System.out.println(peoples);

        //People类实现了接口Comparable，即自带比较信息。
        //Collections直接进行排序，无需额外的Comparator
        Collections.sort(peoples);
        System.out.println("按照伤害高低排序后的集合");
        System.out.println(peoples);
    }

}
