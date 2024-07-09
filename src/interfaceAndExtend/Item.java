package interfaceAndExtend;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("父类Item的effect方法");
    }
}
