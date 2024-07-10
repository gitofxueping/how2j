package basic.interfaceAndExtend;

public class LifePotion extends Item{
    public void effect(){
        System.out.println("LifePotion的effect方法");
    }

    public static void main(String[] args) {
        method1();
    }

    /**方法的重写*/
    public static void method1(){
        Item i = new Item();
        i.effect();

        /*调用重写的方法
        调用就会执行重写的方法，而不是从父类的方法*/
        LifePotion lp =new LifePotion();
        lp.effect();
    }
}
