package classAndObject;

//属性初始化:对象属性初始化和类属性初始化
public class Car {

    /*对象属性初始化有3种:
         1. 声明该属性的时候初始化
         2. 构造方法中初始化
         3. 初始化块*/

    public String name = "some car"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;

    public Car(){
        hp = 100; //构造方法中初始化
    }

    {
        maxHP = 200; //初始化块
    }


    /*类属性初始化有2种
        1. 声明该属性的时候初始化
        2. 静态初始化块*/
    public static int itemCapacity=8; //声明的时候 初始化

    static{
        itemCapacity = 6;//静态初始化块 初始化
    }

}
