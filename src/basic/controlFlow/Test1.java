package basic.controlFlow;

//控制流程 if,switch,for循环,continue,break,结束外部循环
public class Test1 {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        method6();
    }

    /** if */
    public static void method1(){
        boolean b = true;
        //如果有多个表达式，必须用大括弧包括起来
        if(b){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b是否为true都会执行
        if(b)
            System.out.println("yes1");
        System.out.println("yes2");
        System.out.println("yes3");

        //如果只有一个表达式可以不用写括弧，看上去会简约一些
        if(b){
            System.out.println("yes1");
        }

        if(b)
            System.out.println("yes1");

    }

    /** switch */
    public static void method2(){
        int day = 4;
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                //break;
            case 5:
                System.out.println("星期五");
                //break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }
    }

    /** continue 继续下一次循环 */
    public static void method3(){
        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环
            System.out.println(j);
        }
    }

    /** break 结束当前循环 */
    public static void method4(){
        //打印单数
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break; //如果是双数，结束当前循环
            }
        }
    }

    /** 使用boolean变量结束外部循环    */
    public static void method5(){
        /*借助boolean变量结束外部循环
          需要在内部循环中修改这个变量值
          每次内部循环结束后，都要在外部循环中判断，这个变量的值*/

        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }
    }

    /** 使用标签结束外部循环 */
    public static void method6(){

        /*在外部循环的前一行，加上标签
          在break的时候使用该标签
          即能达到结束外部循环的效果*/

        //打印单数
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop; //如果是双数，结束外部循环
            }
        }
    }

}
