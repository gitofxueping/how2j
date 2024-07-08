package classAndObject;

//方法的重载
public class Test1 {

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        //方法的重载指的是方法名一样，但是参数类型不一样,会根据传递的参数类型以及数量，自动调用对应的方法
        bh.attack(h1);
        bh.attack(h1, h2);
    }
}
