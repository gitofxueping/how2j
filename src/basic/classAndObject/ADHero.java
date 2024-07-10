package basic.classAndObject;

//类的继承
public class ADHero extends Hero {

    /*public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }*/

    /**隐式的构造方法*/
    /*如果不写构造方法，就会默认提供一个无参的构造方法。
    一旦提供了一个有参的构造方法，同时又没有显式的提供一个无参的构造方法，那么默认的无参的构造方法，就“木有了“*/
    /*public ADHero(){
        System.out.println("调用ADHero的构造方法");
    }*/

    /**可变数量的参数*/
    public void attack(Hero... heros) {
        /*这时，可以采用可变数量的参数，只需要设计一个方法 public void attack(Hero ...heros)
        在方法里，使用操作数组的方式处理参数heros即可*/

        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);
        }
    }


}
