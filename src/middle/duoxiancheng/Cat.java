package middle.duoxiancheng;

public class Cat {

    public String name;
    public float hp;

    public int damage;

    public void attackCat(Cat h) {

        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

    //回血
    //直接在方法前加上修饰符synchronized
    //其所对应的同步对象，就是this
    //和hurt方法达到的效果一样
    public synchronized void recover(){
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
