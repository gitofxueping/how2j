package shuzu;

//数组的复制
public class Test3 {

    public static void main(String[] args) {
        method1();
        method2();
    }

    /** 复制数组方法①：for循环 */
    public static void method1(){
        int a [] = new int[]{18,62,68,82,65,9};

        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值

        //通过数组赋值，把a数组的前3位赋值到b数组
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    /** 复制数组方法②：System.arraycopy(src, srcPos, dest, destPos, length) */
    public static void method2(){
        int a [] = new int[]{18,62,68,82,65,9};

        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值

        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);
        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
