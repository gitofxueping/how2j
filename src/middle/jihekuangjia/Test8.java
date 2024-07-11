package middle.jihekuangjia;

import java.util.HashSet;
import java.util.Iterator;

//HashSet:Set中的元素，不能重复,且没有顺序
public class Test8 {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    /** Set中的元素不能重复,且没有顺序  */
    public static void method1(){
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(9);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);

        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers); //[1, 5, 9]
    }

    /** Set遍历：Set不提供get()来获取指定位置的元素。所以遍历需要用到迭代器，或者增强型for循环 */
    public static void method2(){
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        //或者采用增强型for循环
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

    /** HashSet和HashMap的关系 */
    public static void method3(){
        /*HashSet是作为Map的key而存在的
          而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。*/
    }

}
