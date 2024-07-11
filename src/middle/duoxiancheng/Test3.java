package middle.duoxiancheng;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//多线程的同步问题:指的是多个线程同时修改一个数据的时候
public class Test3 {
    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        method1(); //synchronized 同步对象
        method2(); //使用hero对象作为同步对象,在方法体加上修饰符synchronized
        method3(); //在方法前，加上修饰符synchronized
        method4();
    }

    /** synchronized 同步对象 */
    public static void method1(){
        final Object someObject = new Object();

        Thread t1 = new Thread(){
            public void run(){
                try {
                    System.out.println( now()+" t1 线程已经运行");
                    System.out.println( now()+this.getName()+ " 试图占有对象：someObject");
                    synchronized (someObject) {

                        System.out.println( now()+this.getName()+ " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " 释放对象：someObject");
                    }
                    System.out.println(now()+" t1 线程结束");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t1.setName(" t1");
        t1.start();
        Thread t2 = new Thread(){

            public void run(){
                try {
                    System.out.println( now()+" t2 线程已经运行");
                    System.out.println( now()+this.getName()+ " 试图占有对象：someObject");
                    synchronized (someObject) {
                        System.out.println( now()+this.getName()+ " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " 释放对象：someObject");
                    }
                    System.out.println(now()+" t2 线程结束");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t2.setName(" t2");
        t2.start();
    }

    /** 使用hero对象作为同步对象 */
    public static void method2(){
        /*对于Hero的hurt方法，加上：
          synchronized (this) {
          }*/
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;

        int n = 10000;

        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){

                    //使用gareen作为synchronized
                    synchronized (gareen) {
                        gareen.recover();
                    }

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;

        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //使用gareen作为synchronized
                    //在方法hurt中有synchronized(this)
                    gareen.hurt();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }

        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);

    }

    /** 在方法前，加上修饰符synchronized */
    public static void method3(){
        /*在recover前，直接加上synchronized ，其所对应的同步对象，就是this
          和hurt方法达到的效果是一样
        外部线程访问gareen的方法，就不需要额外使用synchronized 了*/

        final Cat gareen = new Cat();
        gareen.name = "盖伦";
        gareen.hp = 10000;

        int n = 10000;

        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //recover自带synchronized
                    gareen.recover();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;

        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //hurt自带synchronized
                    gareen.hurt();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }

        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);
    }

    /** 线程安全的类:方法都是有synchronized修饰的类  */
    public static void method4(){
        /*同一时间，只有一个线程能够进入 这种类的一个实例 的去修改数据，进而保证了这个实例中的数据的安全(不会同时被多线程修改而变成脏数据)
          比如StringBuffer和StringBuilder的区别:
          StringBuffer的方法都是有synchronized修饰的，StringBuffer就叫做线程安全的类；
          StringBuilder就不是线程安全的类*/
    }
}
