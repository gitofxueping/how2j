package qianduan.javascript;

/** JavaScript语言基础 */
public class Test1 {

/*
  1.script标签：
    (1)javascript代码必须放在script标签中。
       script标签可以放在html的任何地方，一般建议放在head标签里
    (2)javascript顺序执行: 如果有多段script代码，会按照从上到下，顺序执行
    (3)使用外部js文件：把javascript代码剥离出来，单独放在一个js文件里，在html中引用该文件即可。注意，js文件中不要写 script标签。
       ①准备一个hello.js，里面的是内容是
         document.write("hello javascript ");
       ②<html>
           <script src="https://how2j.cn/study/hello.js"></script>
        </html>

        备注：引入css <link rel="stylesheet" type="text/css" href="file://d:/style.css"" />
  2.注释：①单行注释：//
         ②多行注释: *//* … *//*
  3.声明变量: 关键字var 可有可无
        <script>
            var x = 10;
            y = 20 ;
            document.write("变量x的值:"+x);
        </script>
  4.调试办法：使用alert(1)进行调试，如果弹出了1,这个位置以上的代码，都是可以运行的。
  5.基本数据类型: undefined，Boolean,Number,String，null
     (1)当一个变量被声明了，却没有赋值的时候，叫做 undefined
     (2)字符串: javascript中没有字符的概念，只有字符串，所以单引号和双引号，都用来表示字符串。
     (3)动态类型：变量的类型是动态的，当值是整数的时候，就是Number类型，当值是字符串的时候，就是String类型
     (4)使用typeof来进行判断数据类型
  6.类型转换
     (1)伪对象概念：即便是基本类型，也是伪对象，所以他们都有属性和方法。
        如果是字符串类型，通过调用其为伪对象的属性length获取其长度；
        <script>
           var a="hello javascript";
           document.write("变量a的类型是:"+(typeof a));
           document.write("<br>");
           document.write("变量a的长度是:"+a.length);
        </script>
     (2)转换为字符串:Number,Boolean,String都有一个toString方法，用于转换为字符串；
        String()和toString()都会返回字符串，区别在于对null的处理:
        String()会返回字符串"null"；
        toString() 就会报错，无法执行；

        var a = null;
        document.write('String(null) 把空对象转换为字符串：'+String(a));
        document.write(a.toString());
     (3)转换为数字:javascript分别提供内置函数 parseInt()和parseFloat()；
        ①字符串的"10"转换为数字的:10
          document.write("字符串的\"10\"转换为数字的:"+parseInt("10")); //转换整数
        ②字符串的"3.14"转换为数字的:3.14
        ③字符串的"10abc"转换为数字的:10
         document.write("字符串的\"10abc\"转换为数字的:"+parseInt("10abc")); //判断每一位，直到发现不是数字的那一位
        ④字符串的"hello javascript"转换为数字的:NaN
        ⑤Number()和parseInt()都可以用来进行数字的转换，区别：
          Number()当转换的内容包含非数字的时候，会返回NaN(Not a Number)；
          parseInt() 要看情况，如果以数字开头，就会返回开头的合法数字部分，如果以非数字开头，则返回NaN
     (4)转换为Boolean:使用内置函数Boolean() 转换为Boolean值
        当转换字符串时：非空即为true
        document.write("数字 0 转换为布尔后的值:"+Boolean(0));  //0
        当转换数字时：非0即为true
        document.write("数字 3.14 转换为布尔后的值:"+Boolean(3.14)); //非0
        当转换对象时：非null即为true
        document.write("空对象 null 转换为布尔后的值:"+Boolean(null));  //null
  7.函数
     （1）定义：function关键字用于定义一个函数，没有返回值类型
        <script>
            function print(message){
                document.write(message);
            }

            function calc(x,y){
                return x+y;
            }

            var sum = calc(500,20);
            print(sum);
        </script>
  8.作用域
      (1)参数的作用域: 一个参数的作用域就在这个函数内部，超出函数就看不见该参数了
      (2)全局变量的作用域:
  9.事件: 事件是javascript允许html与用户交互的行为
         button元素上增加一个属性onclick,表示点击的时候触发,
         value是showHello()，调用showHello()函数
         <button onclick="showHello()">点击一下</button> //调用showHello()函数
  10.算数运算符: + - * / % 自增++ 自减-- = += -= *= /= %=
  11.逻辑运算符:① ==, !=,>,>=
              ②与==进行值是否相等的判断不同 ，绝对等 ===还会进行 类型的判断
                比如 数字1和 字符串'1'比较，值是相等的，但是类型不同
              ③ 三目运算符:  三目运算符 ? a: b
                如果第一个返回true,就返回a,否则就返回b。
  12.条件语句:if…else…,switch
  13.循环语句:for,while,do…while,forEach，continue,break
  14.错误处理: try...catch...
 */

}
