package basic.caozuofu;

//三元操作符
public class Test3 {
    /*表达式?值1:值2
    如果表达式为真 返回值1
    如果表达式为假 返回值2*/
    public static void main(String[] args) {

        int i = 5;
        int j = 6;
        int k = i < j ? 99 : 88;
        System.out.println(k);

    }
}
