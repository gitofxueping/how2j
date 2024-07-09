package interfaceAndExtend;

//super关键字:子类通过super关键字调用父类的带参构造方法，属性，方法
public class Children extends Parent implements AD{

    int moveSpeed=400; //移动速度

    @Override
    public void physicAttack() {
        System.out.println("子类的physicAttack方法");
    }

    public Children(){
        System.out.println("子类Children的构造方法");
    }

    public Children(String name){
        super(name);
        System.out.println("Children的构造方法");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("Children use item");
        super.useItem(i);
    }
}
