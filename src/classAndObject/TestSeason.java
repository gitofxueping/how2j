package classAndObject;

//枚举类的测试类
public class TestSeason {
    public static void main(String[] args) {
        //method1();
        method2();

    }

    /** 遍历枚举值 */
    public static void method1(){
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }

    /** switch和枚举结合 */
    public static void method2(){
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }

}
