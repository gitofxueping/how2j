package classAndObject;

public class Hero {
    String name; //姓名

    float hp; //血量

    // 构造方法:方法名和类名一样（包括大小写），没有返回类型
    public Hero() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public Hero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public Hero(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    //通过this访问属性
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }

    public static void main(String[] args) {
        //创建一个对象
        new Hero();

        //使用一个引用来指向这个对象
        Hero h = new Hero();
    }
}
