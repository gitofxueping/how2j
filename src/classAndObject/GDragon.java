package classAndObject;

/*饿汉式单例模式:无论如何都会创建一个实例
懒汉式单例模式:只有在调用getInstance的时候，才会创建实例、

饿汉式是立即加载的方式，无论是否会用到这个对象，都会加载。
如果在构造方法里写了性能消耗较大，占时较久的代码，比如建立与数据库的连接，那么就会在启动的时候感觉稍微有些卡顿。

懒汉式，是延迟加载的方式，只有使用的时候才会加载。 并且有线程安全的考量。
使用懒汉式，在启动的时候，会感觉到比饿汉式略快，因为并没有做对象的实例化。 但是在第一次调用的时候，会进行实例化操作，感觉上就略慢。

看业务需求，如果业务上允许有比较充分的启动和初始化时间，就使用饿汉式，否则就使用懒汉式

什么是单例模式？
回答的时候，要答到三元素：
  1. 构造方法私有化
  2. 静态属性指向实例
  3. public static的 getInstance方法，返回第二步的静态属性*/

//懒汉式单例模式 示例
public class GDragon {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GDragon(){
    }

    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GDragon instance;

    //public static 方法，返回实例对象
    public static GDragon getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance = new GDragon();
        }
        //返回 instance指向的对象
        return instance;
    }

    public static void main(String[] args) {
        //通过new实例化会报错
        //GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象
        GDragon g1 = GDragon.getInstance();
        GDragon g2 = GDragon.getInstance();
        GDragon g3 = GDragon.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
