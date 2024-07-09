package shuziAndZifuchuan;

//StringBuffer是可变长的字符串
public class Test8 {

    public static void main(String[] args) {
        method1();
        method2();
    }

    /**StringBuffer的 append追加
                      delete 删除
                      insert 插入
                      reverse 反转  */
    public static void method1(){
        String str1 = "let there ";

        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加
        System.out.println(sb); //let there be light

        sb.delete(4, 10);//删除4-10之间的字符
        System.out.println(sb);//let be light

        sb.insert(4, "there ");//在4这个位置插入 there
        System.out.println(sb);//let there be light

        sb.reverse();
        System.out.println(sb);//thgil eb ereht tel
    }

    /** StringBuffer的长度容量  */
    public static void method2(){
        String str1 = "the";

        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.length()); //内容长度为3
        System.out.println(sb.capacity());//总空间为19
    }
}
