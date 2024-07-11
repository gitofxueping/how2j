package middle.jihekuangjia;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

/*序列分先进先出FIFO,先进后出FILO
FIFO在Java中又叫Queue 队列
FILO在Java中又叫Stack 栈*/

/*ArrayList和LinkedList的区别
  ArrayList 顺序结构，定位快，插入，删除数据慢
  LinkedList 链表结构，定位慢，插入，删除数据快 */

//linkedList
/*与ArrayList一样，LinkedList也实现了List接口，诸如add,remove,contains等等方法。 详细使用，请参考 ArrayList 常用方法，在此不作赘述。
  接下来要讲的是LinkedList的一些特别的地方*/
public class Test6 {

    public static void main(String[] args) {
        method1();
    }

    /** 双向链表 - Deque ,Deque 继承 Queue */
    public static void method1(){
        /*除了实现了List接口外，LinkedList还实现了双向链表结构Deque，可以很方便的在头尾插入删除数据*/

        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll =new LinkedList<Hero>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll.addLast(new Hero("hero1"));
        ll.addLast(new Hero("hero2"));
        ll.addLast(new Hero("hero3"));
        System.out.println(ll);//[hero1, hero2, hero3]

        //在最前面插入新的英雄
        ll.addFirst(new Hero("heroX"));
        System.out.println(ll);//[heroX, hero1, hero2, hero3]

        //查看最前面的英雄
        System.out.println(ll.getFirst());//heroX
        //查看最后面的英雄
        System.out.println(ll.getLast());//hero3

        //查看不会导致英雄被删除
        System.out.println(ll);
        //取出最前面的英雄
        System.out.println(ll.removeFirst());//heroX

        //取出最后面的英雄
        System.out.println(ll.removeLast());//hero3

        //取出会导致英雄被删除
        System.out.println(ll);//[hero1, hero2]

    }

    /** 队列 - Queue  */
    public static void method2(){
        /*LinkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
          Queue是先进先出队列 FIFO，常用方法：
          offer 在最后添加元素
          poll 取出第一个元素
          peek 查看第一个元素*/

        //和ArrayList一样，LinkedList也实现了List接口
        List ll =new LinkedList<Hero>();

        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> q= new LinkedList<Hero>();

        //加在队列的最后面
        System.out.print("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));

        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);

        //把第一个拿出来看一看，但是不取出来
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);
    }


}
