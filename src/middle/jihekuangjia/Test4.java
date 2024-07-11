package middle.jihekuangjia;

import java.util.ArrayList;
import java.util.List;

//泛型
public class Test4 {

    public static void main(String[] args) {
        method1();
    }

    /** 泛型 Generic  */
    public static void method1(){
        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros = new ArrayList();
        heros.add(new Hero("盖伦"));

        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
        //如果不是Hero类型，根本就放不进去
        //除此之外，还能存放Hero的子类
        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        List<Hero> genericheros = new ArrayList<Hero>();
        genericheros.add(new Hero("盖伦"));
        Hero h = genericheros.get(0);
    }
}
