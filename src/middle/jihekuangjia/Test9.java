package middle.jihekuangjia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Collection:是一个接口, 是Set List Queue和 Deque的父类
//Collection和Map之间没有关系，Collection是放一个一个对象的，Map 是放键值对的
//Collections是一个类，容器的工具类,就如同Arrays是数组的工具类
public class Test9 {
    public static void main(String[] args) {
        method1();  //reverse 反转
        method2();  //shuffle 混淆
        method3();  //sort 排序
        method4();  //swap 交换
        method5();  //rotate 滚动
        method6();  //synchronizedList
    }

    /** reverse反转   */
    public static void method1(){
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Collections.reverse(numbers);

        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers); //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
    }

    /** shuffle 混淆  */
    public static void method2(){
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Collections.shuffle(numbers);

        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);//[4, 9, 3, 1, 7, 0, 2, 8, 5, 6]
    }

    /** sort 排序  */
    public static void method3(){
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);//[0, 3, 8, 4, 1, 7, 9, 5, 2, 6]

        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    /** swap(list,0,5) 交换两个数据的位置  */
    public static void method4(){
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);//[5, 1, 2, 3, 4, 0, 6, 7, 8, 9]
    }

    /** rotate 滚动  */
    public static void method5(){
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);//[8, 9, 0, 1, 2, 3, 4, 5, 6, 7]
    }

    /** synchronizedList 线程安全化,把非线程安全的List转换为线程安全的List  */
    public static void method6(){
        List<Integer> numbers = new ArrayList<>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
    }
}
