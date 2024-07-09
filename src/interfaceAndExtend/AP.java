package interfaceAndExtend;

//接口
public interface AP {

    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
    int resistMagic = 0;

    public void magicAttack();

    //接口中的实体方法，叫做默认方法
    default public void revive() {
        System.out.println("本英雄复活了");
    }
}
