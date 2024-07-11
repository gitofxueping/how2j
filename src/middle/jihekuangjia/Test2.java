package middle.jihekuangjia;

import java.util.ArrayList;

//集合常用方法
public class Test2 {
    public static void main(String[] args) {
        method1();//add增加：①直接add对象，把对象加在最后面，②在指定位置加对象
        method2();//contains判断是否存在
        method3();//get获取指定位置的对象
        method4();//indexOf用于判断一个对象在ArrayList中所处的位置
        method5();//remove删除:①根据下标删除ArrayList的元素，②根据对象删除
        method6();//set用于替换指定位置的元素
        method7();//size 用于获取ArrayList的大小
        method8();//toArray可以把一个ArrayList对象转换为数组。
        method9();//addAll 把另一个容器所有对象都加进来
        method10();//clear 清空
    }

    /** add增加：①直接add对象，把对象加在最后面，②在指定位置加对象 heros.add(3, specialHero); */
    public static void method1(){
        ArrayList heros = new ArrayList();

        // 把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4]

        // 在指定位置增加对象
        Hero specialHero = new Hero("special hero");
        heros.add(3, specialHero);

        System.out.println(heros.toString());//[hero 0, hero 1, hero 2, special hero, hero 3, hero 4]
    }

    /** contains判断是否存在 */
    public static void method2(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));//false
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));//true
    }

    /** get获取指定位置的对象,如果输入的下标越界会报错 */
    public static void method3(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        //获取指定位置的对象
        System.out.println(heros.get(5));//special hero
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));
    }

    /** indexOf用于判断一个对象在ArrayList中所处的位置 */
    public static void method4(){
        ArrayList heros = new ArrayList();
        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));//5
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));//-1
    }

    /** remove删除:①根据下标删除ArrayList的元素，②根据对象删除 */
    public static void method5(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);//[hero 0, hero 1, hero 3, hero 4, special hero]
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);//[hero 0, hero 1, hero 3, hero 4]
    }

    /** set用于替换指定位置的元素 */
    public static void method6(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        System.out.println("把下标是5的元素，替换为\"hero 5\"");
        heros.set(5, new Hero("hero 5"));
        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, hero 5]
    }

    /** size 用于获取ArrayList的大小 */
    public static void method7(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        System.out.println("获取ArrayList的大小：");
        System.out.println(heros.size());//6
    }

    /** toArray可以把一个ArrayList对象转换为数组。 */
    public static void method8(){
        /*需要注意的是，如果要转换为一个Hero数组，那么需要传递一个Hero数组类型的对象给toArray()，这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组*/
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("数组:" +hs);

    }

    /** addAll 把另一个容器所有对象都加进来 */
    public static void method9(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);

        //把另一个容器里所有的元素，都加入到该容器里来
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);
    }

    /** clear 清空一个ArrayList */
    public static void method10(){
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);//[hero 0, hero 1, hero 2, hero 3, hero 4]
        System.out.println("使用clear清空");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);//[]
    }
}
