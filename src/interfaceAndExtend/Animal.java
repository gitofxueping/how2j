package interfaceAndExtend;

//抽象类
//匿名类
public abstract class Animal {

    String name;

    float hp;

    float armor;

    int moveSpeed;

    public abstract void attack();

    public static void main(String[] args) {
        /*虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
        Animal h= new Animal();*/

        //method1();//匿名类
        method2();//本地类

    }

    /** 匿名类：声明一个类的同时实例化它 */
    public static void method1(){
        Animal h = new Animal(){
            //当场实现attack方法
            public void attack() {
                System.out.println("匿名类的attck方法");
            }
        };
        h.attack();
    }

    /** 本地类：本地类可以理解为有名字的匿名类 */
    public static void method2(){
        //与匿名类的区别在于，本地类有了自定义的类名SomeAnimal
        class SomeAnimal extends Animal{
            public void attack() {
                System.out.println( "本地类的实例对象: "+name);
            }
        }

        SomeAnimal h  =new SomeAnimal();
        h.name ="地卜师";
        h.attack();
    }


}
