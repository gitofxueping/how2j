package yingyong.lombok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/** lombok */
/*开发项目过程中，会有很多的 pojo. pojo 又叫做 javabean,bean,entity 等等，都是他。
pojo会有很多的 setter 和 getter , toString, hashcode, equals 等等
为了偷懒，我们就可以用 lombok. 用了之后就会如下代码所示，加上注解就行了*/


//@Data 注解会为类的所有属性自动生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法。
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hero {

    private int id;
    private String name;

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.name = "张三";
        System.out.println(hero.getName());
        System.out.println(hero.toString());

        System.out.println(new Hero(1,"gareen"));
        System.out.println(new Hero());

        //builder 方式
        Hero h2 =Hero.builder().id(2).name("唐僧").build();
        System.out.println(h2);
    }
}
