package middle.fanxing;

import java.util.LinkedList;

//支持泛型的Stack
//子类泛型不能转为父类泛型，但是子类可以转为父类
public class MyStack<T> {

    LinkedList<T> values = new LinkedList<T>();

    public void push(T t) {
        values.addLast(t);
    }

    public T pull() {
        return values.removeLast();
    }

    public T peek() {
        return values.getLast();
    }

    public static void main(String[] args) {
        //在声明这个Stack的时候，使用泛型<Hero>就表示该Stack只能放Hero
        MyStack<Hero> heroStack = new MyStack<>();
        heroStack.push(new Hero());
        //不能放Item
        //heroStack.push(new Item());

        //在声明这个Stack的时候，使用泛型<Item>就表示该Stack只能放Item
        MyStack<Item> itemStack = new MyStack<>();
        itemStack.push(new Item());
        //不能放Hero
        //itemStack.push(new Hero());
    }
}
