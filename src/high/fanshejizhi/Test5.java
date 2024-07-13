package high.fanshejizhi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/** 反射机制的运用 */
//首先准备两个业务类Service1和Service2，这两个业务类很简单，就是各自都有一个业务方法，分别打印不同的字符串
/*使用反射方式，首先准备一个配置文件，就叫做spring.txt吧, 放在src目录下。 里面存放的是类的名称，和要调用的方法名。
  在method2中，首先取出类名称和方法名，然后通过反射去调用这个方法。
  当需要从调用第一个业务方法，切换到调用第二个业务方法的时候，不需要修改一行代码，也不需要重新编译，只需要修改配置文件spring.txt，再运行即可。*/
public class Test5 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {
        //method1();
        method2();
    }

    /** 非反射方式 */
    public static void method1()  {
        //当需要从第一个业务方法切换到第二个业务方法的时候，使用非反射方式，必须修改代码，并且重新编译运行，才可以达到效果
        //new Service1().doService1();
        new Service2().doService2();
    }

    /** 反射方式 */
    /*使用反射方式，首先准备一个配置文件，就叫做spring.txt吧, 放在src目录下。 里面存放的是类的名称，和要调用的方法名。
      在method2中，首先取出类名称和方法名，然后通过反射去调用这个方法。
      当需要从调用第一个业务方法，切换到调用第二个业务方法的时候，不需要修改一行代码，也不需要重新编译，只需要修改配置文件spring.txt，再运行即可。*/
    public static void method2() throws Exception {

        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("d:\\yanfa2023\\project\\how2j\\how2j\\src\\spring.txt");
        Properties springConfig= new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象
        Object service = c.newInstance();
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(methodName);
        //调用对象的指定方法
        m.invoke(service);
    }
}
