package middle.duoxiancheng;

public class Hero {

    public String name;
    public float hp;

    public int damage;

    public void attackHero(Hero h) {
        try {
            //为了表示攻击需要时间，每次攻击暂停1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

    //回血
    public void recover(){
        hp=hp+1;
    }

    //掉血
    public void hurt(){
        //使用this作为同步对象
        synchronized (this) {
            hp=hp-1;
        }
    }
}
