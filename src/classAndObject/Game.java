package classAndObject;

//类属性和类方法
public class Game {

    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性

    /*类方法:静态方法，通过类就可以直接调用
      如果一个方法，没有调用任何对象属性，那么就可以考虑设计为类方法*/
    public static void battleWin(){
        System.out.println("battle win");
    }

    public static void main(String[] args) {

        method1();

        //无需对象，直接通过类调用
        Game.battleWin();
    }

    /** 类属性 */
    public static void method1(){

        /*类属性： 又叫做静态属性
        对象属性： 又叫实例属性，非静态属性
        如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
        给英雄设置一个类属性叫做“版权" (copyright), 无论有多少个具体的英雄，所有的英雄的版权都属于 Riot Games公司。*/

        Game game1 =  new Game();
        game1.name = "王者荣耀";
        System.out.println(game1.name);

        //访问类属性:类.类属性
        Game.copyright = "版权由腾讯 Games公司所有";
    }

}
