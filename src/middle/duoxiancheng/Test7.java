package middle.duoxiancheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//线程池
public class Test7 {
    public static void main(String[] args) {
        //method1();//开发一个自定义线程池
        method2();
    }

    /** 开发一个自定义线程池   */
    public static void method1(){
        ThreadPool pool= new ThreadPool();
        int sleep=1000;
        while(true){
            pool.add(new Runnable(){
                @Override
                public void run() {
                    System.out.println("执行任务");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
            try {
                Thread.sleep(sleep);
                sleep = sleep>100?sleep-100:sleep;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /** 使用java自带线程池   */
    public static void method2(){

        /*第一个参数10 表示这个线程池初始化了10个线程在里面工作
        第二个参数15 表示如果10个线程不够用了，就会自动增加到最多15个线程
        第三个参数60 结合第四个参数TimeUnit.SECONDS，表示经过60秒，多出来的线程还没有接到活儿，就会回收，最后保持池子里就10个
        第四个参数TimeUnit.SECONDS 如上
        第五个参数 new LinkedBlockingQueue() 用来放任务的集合*/
        ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

        threadPool.execute(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("任务1");
            }
        });
    }
}
