package high.fanshejizhi;

import java.lang.reflect.Method;

/**调用方法*/

public class Test4 {

    public static void main(String[] args) {
        Hero h = new Hero();
        //通过反射机制调用Hero的setName
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            // 对h对象，调用这个方法
            m.invoke(h, "盖伦");
            // 使用传统的方式，调用getName方法
            System.out.println(h.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
