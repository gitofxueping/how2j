package middle.duoxiancheng;



import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        method1();//Thread.sleep(1000) 当前线程暂停
        method2();//join 加入到当前线程中,直到该线程运行结束，其他线程才会继续往下走
        method3();//setPriority 线程优先级
        method4();//yield 当前线程临时暂停
        method5();//setDaemon 守护线程
    }

    /** Thread.sleep(1000) 当前线程暂停 */
    public static void method1(){
        Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);

                    if(seconds>10){
                        System.out.printf("游戏结束");
                        break;
                    }
                }
            }
        };
        t1.start();
    }

    /** join 加入到当前线程中 */
    public static void method2(){
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();

        //代码执行到这里，一直是main线程在运行
        try {
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        //会观察到盖伦把提莫杀掉后，才运行t2线程
        t2.start();
    }

    /** setPriority 线程优先级 :优先级高的线程会有更大的几率获得CPU资源 */
    public static void method3(){
        System.out.println("线程优先级方法开始");
        final Cat gareen = new Cat();
        gareen.name = "盖伦";
        gareen.hp = 6160;
        gareen.damage = 1;

        final Cat teemo = new Cat();
        teemo.name = "提莫";
        teemo.hp = 3000;
        teemo.damage = 1;

        final Cat bh = new Cat();
        bh.name = "赏金猎人";
        bh.hp = 5000;
        bh.damage = 1;

        final Cat leesin = new Cat();
        leesin.name = "盲僧";
        leesin.hp = 4505;
        leesin.damage = 1;

        Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackCat(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackCat(leesin);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

    /** yield 当前线程临时暂停，使得其他线程可以有更多的机会占用CPU资源 */
    public static void method4(){
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 600;
        gareen.damage = 10;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 10;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 600;
        bh.damage = 10;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 300;
        leesin.damage = 10;

        Thread t1= new Thread(){
            public void run(){

                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    //临时暂停，使得t1可以占用CPU资源
                    Thread.yield();

                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }

    /** setDaemon 守护线程 */
    /*守护线程的概念是： 当一个进程里，所有的线程都是守护线程的时候，结束当前进程。
    守护线程通常会被用来做日志，性能统计等工作。*/
    public static void method5(){
        Thread t1= new Thread(){
            public void run(){
                int seconds =0;

                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);

                }
            }
        };
        t1.setDaemon(true);
        t1.start();
    }
}
