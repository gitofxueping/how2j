package basic.interfaceAndExtend;

//接口
public class ADHuman extends Human implements AD{

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }


}
