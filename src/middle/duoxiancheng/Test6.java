package middle.duoxiancheng;

/*wait方法和notify方法，并不是Thread线程上的方法，
 wait和notify是同步对象上的方法。
 wait()的意思是： 让占用了这个同步对象的线程，临时释放当前的占用，并且等待。 所以调用wait是有前提条件的，一定是在synchronized块里，否则就会出错。
 notify() 的意思是，通知一个等待在这个同步对象上的线程，你可以苏醒过来了，有机会重新占用当前对象了。
 notifyAll() 的意思是，通知所有的等待在这个同步对象上的线程，你们可以苏醒过来了，有机会重新占用当前对象了。*/

//使用wait和notify进行线程交互
public class Test6 {
    public static void main(String[] args) {
        method1();
    }

    /** 使用wait和notify进行线程交互  */
    public static void method1(){

        final Animal gareen = new Animal();
        gareen.name = "盖伦";
        gareen.hp = 616;

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    gareen.hurt();  //hurt()减血方法有wait().让占有this的减血线程，暂时释放对this的占有，并等待

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();//recover()加血方法有notify().this.notify() 表示通知那些等待在this的线程，可以苏醒过来了
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
}
