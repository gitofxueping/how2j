package middle.jihekuangjia;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        method1();//
    }

    /** ArrayList实现了接口List  */
    public static void method1(){
        //ArrayList实现了接口List

        //常见的写法会把引用声明为接口List类型,接口引用指向子类对象（多态）
        //注意：是java.util.List,而不是java.awt.List
        List heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        System.out.println(heros.size());
    }
}
