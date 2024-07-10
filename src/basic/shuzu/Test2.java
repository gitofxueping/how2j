package basic.shuzu;

//for循环：常规和增强型
public class Test2 {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    /** 常规for循环 */
    public static void method1(){
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }
    }

    /** 增强for循环 */
    public static void method2(){
        //增强型for循环只能用来取值，却不能用来修改数组里的值

        int values [] = new int[]{18,62,68,82,65,9};
        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }
    }
}
