package interfaceAndExtend;

//非静态内部类：BattleScore，实例化语法  new 外部类().静态内部类();②静态内部类能访问外部类的静态成员和非静态成员
//静态内部类: EnemyCrystal，①实例化语法 new 外部类.静态内部类();②静态内部类只能访问外部类的静态成员
public class InnerAnimal {
    private String name; // 姓名

    // 非静态内部类，只有外部类对象存在的时候，才有意义
    // 战斗成绩只有在英雄对象存在的时候才有意义
    class BattleScore {
        int kill;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }

    private static void battleWin(){
        System.out.println("battle win");
    }

    //静态内部类：静态内部类不能访问外部类的对象属性
    static class EnemyCrystal{
        int hp=0;
        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                InnerAnimal.battleWin();
                System.out.println(" win this game");
            }
        }
    }

    public static void main(String[] args) {
        //method1();//非静态内部类的运用
        method2();//静态内部类的运用

    }

    /** 非静态内部类的运用 */
    public static void method1(){
        InnerAnimal garen = new InnerAnimal();
        garen.name = "盖伦";
        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }

    /** 静态内部类的运用 */
    public static void method2(){
        //实例化静态内部类
        InnerAnimal.EnemyCrystal crystal = new InnerAnimal.EnemyCrystal();
        crystal.checkIfVictory();
    }

}
