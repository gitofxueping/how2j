package classAndObject;

/*访问修饰符
1. 属性通常使用private封装起来
2. 方法一般使用public用于被调用
3. 会被子类继承的方法，通常使用protected*/

public class Test4 {

    //属性id是private的，只有自己可以访问,子类不能继承,其他类也不能访问
    private int id;

    //无修饰符的属性 hp,自己可以访问,同包子类可以继承,不同包子类不能继承,同包类可以访问,不同包类不能访问
    float hp;

    //protected饰符的属性 armor,自己可以访问,同包子类可以继承,不同包子类可以继承,同包类可以访问,不同包类不能访问
    protected float armor;

    //public的属性name 自己可以访问,同包子类可以继承,不同包子类可以继承,同包类可以访问,不同包类可以访问
    public String name;

}
