package middle.jihekuangjia;

public class People implements Comparable<People>{

    public String name;
    public float hp;

    public int damage;

    public People(){

    }

    public People(String name) {
        this.name =name;

    }

    //初始化name,hp,damage的构造方法
    public People(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public int compareTo(People anotherPeople) {
        if(this.damage<anotherPeople.damage)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
