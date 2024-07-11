package middle.jihekuangjia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//遍历
public class Test5 {

    public static void main(String[] args) {
        method1();//用size(),get(),for 结合循环遍历
        method2();//iterator 迭代器遍历
        method3(); //增强型for循环
    }

    /** 用for循环遍历  */
    public static void method1(){
        /*用size()和get()分别得到大小，和获取指定位置的元素，结合for循环就可以遍历出ArrayList的内容*/
        List<Hero> heros = new ArrayList<>();

        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        // 第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero h = heros.get(i);
            System.out.println(h);
        }
    }

    /** iterator 迭代器遍历  */
    public static void method2(){
        List<Hero> heros = new ArrayList<Hero>();

        //放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " +i));
        }

        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it= heros.iterator();
        //从最开始的位置hasNext()判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
    }

    /** 用增强型for循环  */
    public static void method3(){
        List<Hero> heros = new ArrayList<Hero>();

        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : heros) {
            System.out.println(h);
        }
    }
}
