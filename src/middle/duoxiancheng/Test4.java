package middle.duoxiancheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//线程安全的类:方法都是有synchronized修饰的类
public class Test4 {

    /*常见的线程安全相关的面试题
    1.HashMap和Hashtable的区别
      HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
      区别1：
         HashMap可以存放 null
         Hashtable不能存放null
      区别2：
         HashMap不是线程安全的类
         Hashtable是线程安全的类

    2.StringBuffer和StringBuilder的区别
      StringBuffer 是线程安全的
      StringBuilder 是非线程安全的

      所以当进行大量字符串拼接操作的时候，如果是单线程就用StringBuilder会更快些，如果是多线程，就需要用StringBuffer 保证数据的安全性

    3.ArrayList和Vector的区别
      Vector是线程安全的类
      ArrayList是非线程安全的。

    4.把非线程安全的集合转换为线程安全
      借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List。*/

    public static void main(String[] args) {
        // 借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Collections.synchronizedList(list1);
    }


}
