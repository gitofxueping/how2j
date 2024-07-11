package middle.jihekuangjia;

public class Test10 {

    /*关系与区别
     1.ArrayList和LinkedList的区别
         ArrayList 顺序结构，定位块，插入，删除数据慢
         LinkedList 链表结构，定位慢，插入，删除数据快

     2.ArrayList和HashSet的区别
         ArrayList: 有顺序,可以重复
         HashSet: 无顺序，不能重复

         重复判断标准是:
        ①首先看hashcode是否相同。如果hashcode不同，则认为是不同数据
        ②如果hashcode相同，再比较equals。如果equals相同，则是相同数据，否则是不同数据。

    3.HashMap和Hashtable的区别
      HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
         区别①：
         HashMap可以存放 null
         Hashtable不能存放null
         区别②：
         HashMap不是线程安全的类
         Hashtable是线程安全的类*/

    //hashcode原理：所有的对象，都有一个对应的hashcode（散列值）。
    //根据hashcode值，能快速查找到对象，若有多个对象的hashcode值相同，再根据equals进行逐一比较

}
