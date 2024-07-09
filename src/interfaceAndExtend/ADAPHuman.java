package interfaceAndExtend;

//接口
public class ADAPHuman extends Human implements AD,AP{

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }


}
