package high.zhujie;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/** 元注解 */
/*@Target: 表示这个注解能放在什么位置上，@Target({METHOD,TYPE})，表示他可以用在方法和类型上（类和接口），但是不能放在属性等其他位置
     ElementType.TYPE：能修饰类、接口或枚举类型
     ElementType.FIELD：能修饰成员变量
     ElementType.METHOD：能修饰方法
     ElementType.PARAMETER：能修饰参数
     ElementType.CONSTRUCTOR：能修饰构造器
     ElementType.LOCAL_VARIABLE：能修饰局部变量
     ElementType.ANNOTATION_TYPE：能修饰注解
     ElementType.PACKAGE：能修饰包*/

/*@Retention:表示生命周期,选的值有3个：
     RetentionPolicy.SOURCE： 注解只在源代码中存在，编译成class之后，就没了。@Override 就是这种注解。
     RetentionPolicy.CLASS： 注解在java文件编程成.class文件后，依然存在，但是运行起来后就没了。
                            @Retention的默认值，即当没有显式指定@Retention的时候，就会是这种类型。
     RetentionPolicy.RUNTIME： 注解在运行起来之后依然存在，程序可以通过反射获取这些信息，自定义注解@JDBCConfig。*/

/*@Inherited: 表示该注解具有继承性
 @Documented: 在用javadoc命令生成API文档后，用到注解的类文档里会出现该注解说明
 @Repeatable:①当没有@Repeatable修饰的时候，注解在同一个位置，只能出现一次
            ②使用@Repeatable之后，再配合一些其他动作，就可以在同一个地方使用多次了。*/
public class FindFiles {

    /*1. 注解FileTypes，其value()返回一个FileType数组
      2. 注解FileType，其@Repeatable的值采用FileTypes
      3. 运用注解：在work方法上重复使用多次@FileType注解
      4. 解析注解： 在work方法内，通过反射获取到本方法上的FileType类型的注解数组，然后遍历本数组*/

    @Target( METHOD)
    @Retention( RetentionPolicy.RUNTIME )
    public @interface FileTypes {
        FileType[] value();
    }

    @Target(  METHOD )
    @Retention( RetentionPolicy.RUNTIME )
    @Repeatable( FileTypes.class )
    public @interface FileType {
        String value();
    };

    @FileType( ".java" )
    @FileType( ".html" )
    @FileType( ".css" )
    @FileType( ".js" )
    public void work(){

        try {
            FileType[] fileTypes= this.getClass().getMethod("work").getAnnotationsByType(FileType.class);
            System.out.println("将从如下后缀名的文件中查找文件内容");
            for (FileType fileType : fileTypes) {
                System.out.println(fileType.value());
            }
            System.out.println("查找过程略。。。");
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FindFiles().work();
    }
}
