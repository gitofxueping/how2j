package shuzu;

//数组的创建，长度，访问,初始化，冒泡排序
public class Test1 {

    public static void main(String[] args) {
        //method1();
        method3();
    }

    /** 数组的创建，长度，访问 */
    public static void method1(){
        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];
        //.length属性用于访问一个数组的长度,数组下标基0,数组访问下标范围是0到长度-1
        System.out.println(a.length); //打印数组的长度
        a[4]=100; //下标4，实质上是“第5个”，即最后一个

        int[] b = new int[5]; //声明的同时，指向一个数组

    }

    /** 数组的初始化 */
    public static void method2(){
        //分配空间与赋值 先后分步进行
        int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值
        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
        System.out.println(a[0]);
        //进行赋值
        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;

        //分配空间与赋值 同步进行
        //写法一： 分配空间同时赋值
        int[] b = new int[]{100,102,444,836,3236};
        //写法二： 省略了new int[],效果一样
        int[] c = {100,102,444,836,3236};

    }

    /** 冒泡排序法 */
    public static void method3(){
        int a [] = new int[]{18,62,68,82,65,9};
        System.out.println("a.length="+a.length);
        //排序前，先把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        //冒泡法排序

        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换在后面

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        //把内容打印出来
        //可以发现，最大的到了最后面
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        //第二步： 再来一次，只不过不用比较最后一位
        for (int i = 0; i < a.length-2; i++) {
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        //把内容打印出来
        //可以发现，倒数第二大的到了倒数第二个位置
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        //可以发现一个规律
        //后边界在收缩
        //所以可以在外面套一层循环

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-1-j; i++) {
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

        //把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }


}
