package qianduan.javascript;

/** JavaScript对象 */
public class Test2 {
    /*JavaScript 对象
    JavaScript中的对象是有着属性和方法的一种特殊数据类型。
    常见的对象有数字Number，字符串String，日期Date，数组Array等。
    1.数字对象
     (1)这里讲的Number是数字对象Number,和基本数据类型中的基本类型Number是不一样的Number。
     (2)可以通过new Number()创建一个数字对象
        var x = new Number(123);
     (3)表示不是数字NaN(Not a Number)，当通过非数字创建Number的时候，就会得到NaN.
        注意：判断 是否 “不是一个数字”，应该使用函数 isNaN()
     (4)返回一个数字的小数表达: toFixed
        var b = new Number("3.1415926");
        b.toFixed(3));//保留三位小数点
     (5)返回一个数字对象的基本数字类型数字:  valueOf()
    2.字符串对象属性 length
     (1)创建字符串对象：new String()
     (2)字符串长度: 属性length
     (3)返回指定位置的字符: charAt
     (4)字符串拼接: concat
     (5)子字符串出现的位置: indexOf 返回子字符串第一次出现的位置;
        lastIndexOf 返回子字符串最后一次出现的位置;
     (6)比较两段字符串是否相同:localeCompare 比较两段字符串是否相同，
        0即表示相同, 1 表示字母顺序靠后,-1 表示字母顺序靠前
     (7)截取一段子字符串: substring(a,b) 截取一段子字符串
        注：左闭右开，第二个参数取不到
     (8)根据分隔符，把字符串转换为数组: split
     (9)替换子字符串: replace(search,replacement)
        找到满足条件的子字符串search，替换为replacement
     (10)返回基本类型String：所有返回字符串类型的方法，返回的都是基本类型的String
   3.数组
     (1)javascript中的数组是动态的，即长度是可以发生变化的。
     (2)创建数组对象:
        var x = new Array(); //创建长度是0的数组;
        x = new Array(5); //创建长度是5的数组,，但是其每一个元素都是undefine;
        x = new Array(3,1,4,1,5,9,2,6); //根据参数创建数组;
     (3)数组长度:属性length
     (4)遍历数组
        ①结合for循环，通过下标遍历
        ②使用增强for in循环遍历，i是下标的意思。
            for(i in x){  //for in 循环
               p(x[i]);
            }
     (5)连接数组：方法 concat 连接两个数组
     (6)方法join 通过指定分隔符，返回一个数组的字符串表达
        var x = new Array(3,1,4);//数组x是:3,1,4
        y = x.join();//是x的字符串表达，分隔符是默认的",",其值是3,1,4 其类型是 :string
        z = x.join("@");//是x的字符串表达，分隔符是"@" , 其值是3@1@4
     (7)push pop分别在最后的位置插入数据和获取数据(获取后删除),
        数组x是:3,1,4
        向x中push 5,得到 3,1,4,5
        从x中pop一个值出来，其值是 5
        pop之后，x数组的值是:3,1,4
     (8)方法 unshift shift ,分别在最开始的位置插入数据和获取数据(获取后删除),
        数组x是:3,1,4
        对数组 unshift 值5(在最前面加)，数组变为:5,3,1,4
        从数组中 shift 一个数(从最前面取)，其值是:5
        shift之后，数组变为:3,1,4
     (9)方法 sort对数组的内容进行排序。sort()默认采用正排序，即小的数排在前面
     (10)自定义排序算法: 把比较器函数作为参数传递给sort()
        function comparator(v1,v2){
           return v2-v1;  //v2-v1表示大的放前面，小的放后面
        }
        x.sort(comparator);
     (11)对数组的内容进行反转: 方法 reverse
     (12)获取子数组slice(a,b),注意第二个参数取不到
     (13)splice用于删除数组中的元素,它还能用于向数组中插入元素
         数组x是:3,1,4,1,5,9,2,6
         x.splice (3,2) 表示从位置3开始 ，删除2个元素:3,1,4,9,2,6
         x.splice(3,0,1,5) 从位置3开始，删除0个元素，但是插入1和5,最后得到:3,1,4,1,5,9,2,6
  4.日期
     (1)创建日期对象: new Date();
     (2)获取年:getFullYear()，
        获取月[基0]:getMonth()，
        获取日:getDate()；
        时getHours(),
        分getMinutes(),
        秒getSeconds(),
        毫秒getMilliseconds()
        一周的第几天[基0]:getDay()，
        经历的毫秒数getTime()
     (3)修改日期和时间
        var d=new Date();
        d.setFullYear(2012);
        d.setMonth(11); //月份是基0的，所以11表示12月
        d.setDate(12);
   5.Math
     (1)Math是JavaScript的工具对象，用于常见的数学运算
     (2)自然对数Math.E和圆周率Math.PI
     (3)绝对值Math.abs(-1)
     (4)最小值Math.min(1,100)
     (5)最大值Math.max(1,100)
     (6)方法pow求一个数的n次方: Math.pow(3,3)
     (7)方法round,小数四舍五入取整: Math.round(3.4)
     (8)方法random 取0-1之间的随机数:  Math.random()
   6.自定义对象
     (1)通过new Object()创建对象：
        <script>
           var hero = new Object();
           hero.name = "盖伦"; //定义一个属性name，并且赋值
           hero.kill = function(){
              document.write(hero.name + " 正在杀敌" ); //定义一个函数kill
           }
           hero.kill(); //调用函数kill
        </script>
     (2)通过function设计一个对象,
        javascript没有类，只有对象，所以我们叫设计一种对象
        <script>
           function Hero(name){
              this.name = name;
              this.kill = function(){
                  document.write(this.name + "正在杀敌<br>");
              }
           }

           var gareen = new Hero("盖伦");
           gareen.kill();
        </script>
     (3)为已经存在的对象，增加新的方法,在新增方法需增加修饰词prototype
        Hero.prototype.keng = function(){
           document.write(this.name + "正在坑队友<br>");
        }
        gareen.keng();
 */

}
