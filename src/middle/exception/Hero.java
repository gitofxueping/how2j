package middle.exception;

//自定义异常
public class Hero {

    public String name;

    protected float hp;

    public String toString(){
        return name;
    }

    /* 创建自定义异常EnemyHeroIsDeadException:  */
    class EnemyHeroIsDeadException extends Exception{
        //创建一个类EnemyHeroIsDeadException，并继承Exception，提供两个构造方法:①无参的构造方法，②带参的构造方法，并调用父类的对应的构造方法

        public EnemyHeroIsDeadException(){

        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }

    /*抛出自定义异常*/
    public void attackHero(Hero h) throws EnemyHeroIsDeadException{
        /*当发现敌方英雄的血量为0的时候，抛出自定义异常EnemyHeroIsDeadException
        1. 创建一个EnemyHeroIsDeadException实例,通过throw 抛出该异常
        2. 当前方法通过 throws 抛出该异常给调用方
        3. 在外部调用attack方法的时候，就需要进行捕捉，并且捕捉的时候，可以通过e.getMessage() 获取当时出错的具体原因*/
        if(h.hp == 0){
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不需要施放技能" );
        }
    }

    public static void main(String[] args) {

        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616;

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attackHero(teemo);
        } catch (EnemyHeroIsDeadException e) {
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
