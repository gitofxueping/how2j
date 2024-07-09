package interfaceAndExtend;

public class Parent {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void useItem(Item i){
        System.out.println("Parent use item");
        i.effect();
    }

    //准备显式提供无参构造方法
    public Parent(){
        System.out.println("父类Parent的无参构造方法 ");
    }

    public Parent(String name){
        System.out.println("Parent的有一个参数的构造方法 ");
        this.name = name;
    }

    public static void main(String[] args) {
        new Parent();
    }


}
