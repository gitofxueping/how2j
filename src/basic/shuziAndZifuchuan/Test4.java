package basic.shuziAndZifuchuan;

//字符串的格式化输出: %s表示字符串，%d表示数字,%n表示换行
public class Test4 {

    public static void main(String[] args) {

        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
        System.out.println(sentence);

        //使用字符串的格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";

        //使用printf格式化输出
        System.out.printf(sentenceFormat,name,kill,title);
        //使用format格式化输出
        System.out.format(sentenceFormat,name,kill,title);

        //使用String.format格式化输出
        String sentenceFormat2 ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        String sentence2 = String.format(sentenceFormat2, name,kill,title);
        System.out.println(sentence2);

    }

}
