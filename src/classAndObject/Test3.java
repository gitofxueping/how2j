package classAndObject;

//this
public class Test3 {

    public static void main(String[] args) {
        //method1();
        //method2();
        method3();
    }

    /** this代表当前对象 */
    public static void method1(){
        Hero garen =  new Hero();
        garen.name = "盖伦";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样
        System.out.println("打印对象看到的虚拟地址："+garen);

        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        garen.showAddressInMemory();
    }

    /** 通过this访问属性 */
    public static void method2(){
        Hero  h =new Hero();
        h.setName3("teemo");
        System.out.println(h.name);
    }

    /** 通过this调用其他的构造方法 */
    public static void method3(){
        Hero teemo =  new Hero("提莫",383);
        System.out.println(teemo.name);
    }
}
