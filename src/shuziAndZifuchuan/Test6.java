package shuziAndZifuchuan;

//操纵字符串
public class Test6 {

    public static void main(String[] args) {
        method1(); //获取字符：charAt(int index)获取指定位置的字符
        method2(); //获取对应的字符数组：toCharArray()
        method3(); //截取子字符串：subString(a,b),左闭右开
        method4(); //split 根据分隔符进行分隔
        method5(); //trim 去掉首尾空格
        method6(); //大小写
        method7(); //定位: indexOf 字符或者子字符串出现的位置，contains 是否包含子字符串
        method8(); //replaceAll 替换所有的，replaceFirst 只替换第一个
    }

    /** 获取字符：charAt(int index)获取指定位置的字符 */
    public static void method1(){

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
        char c = sentence.charAt(0);
        System.out.println(c); //盖
    }

    /** 获取对应的字符数组：toCharArray() */
    public static void method2(){
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        char[] cs = sentence.toCharArray(); //获取对应的字符数组

        System.out.println(sentence.length() ); //长度为24
        System.out.println(cs.length); //长度为24
    }

    /** 截取子字符串：subString(a,b),左闭右开  */
    public static void method3(){
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);
        System.out.println(subString1);//在进行了连续8次击杀后,获得了 超神 的称号

        //截取从第3个开始的字符串 （基0）,
        //左闭右开
        String subString2 = sentence.substring(3,5);// 在进
        System.out.println(subString2);
    }

    /** split 根据分隔符进行分隔 */
    public static void method4(){
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
    }

    /** trim 去掉首尾空格 */
    public static void method5(){
        String sentence = "        盖伦,在进行了连续8次击杀后,获得了 超神 的称号      ";
        System.out.println(sentence);
        //去掉首尾空格
        System.out.println(sentence.trim()); //
    }

    /** toLowerCase 全部变成小写
        toUpperCase 全部变成大写 */
    public static void method6(){
        String sentence = "Garen";

        //全部变成小写
        System.out.println(sentence.toLowerCase());
        //全部变成大写
        System.out.println(sentence.toUpperCase());
    }

    /** 定位： indexOf 字符或者子字符串出现的位置
              contains 是否包含子字符串 */
    public static void method7(){
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";

        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置

        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置

        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置

        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置

        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
    }

    /** 替换 replaceAll(a,b) 所有的a替换成b
            replaceFirst 只替换第一个 */
    public static void method8(){
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";

        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
        System.out.println(temp);

        temp = temp.replaceAll("超神", "超鬼");
        System.out.println(temp);

        temp = sentence.replaceFirst(",","");//只替换第一个
        System.out.println(temp);

    }
}
