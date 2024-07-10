package basic.shuzu;

import java.util.Arrays;

//Arrays:针对数组的工具类，可以进行复制，转为字符串，排序，搜索，数组是否相同，填充等功能
public class Test5 {

    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        method6();
    }

    /** copyOfRange 数组复制 */
    public static void method1(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    /** 转换为字符串 */
    public static void method2(){
       /* 如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
        但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容*/
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(a);
        System.out.println(content);
    }

    /**  排序 Arrays.sort(a) */
    public static void method3(){
        //Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
    }

    /** 搜索 Arrays.binarySearch(a, X) */
    public static void method4(){
        /*查询元素出现的位置
        需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
        如果数组中有多个相同的元素，查找结果是不确定的*/

        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
    }

    /** 判断两个数组是否相同 Arrays.equals(a, b) */
    public static void method5(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
        System.out.println("两个数组是否相同:"+Arrays.equals(a, b));

    }

    /** 填充(使用同一个值，填充整个数组) Arrays.fill(a, value) */
    public static void method6(){
        int a[] = new int[10];
        Arrays.fill(a, 5); //用"5"填充数组
        System.out.println(Arrays.toString(a));
    }
}
