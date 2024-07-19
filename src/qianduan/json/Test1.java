package qianduan.json;

/** json */
public class Test1 {

/*
1.JSON概念: JavaScript 对象表示法（JavaScript Object Notation） 是一种存储数据的方式。

2.创建json对象
  var gareen = {"name":"盖伦","hp":616};
  这样就创建了一个JSON 对象
  JSON对象由 名称/值对组成, 名称和值之间用冒号:隔开
  名称必须用双引号" 包含起来,值可以是任意javascript数据类型，字符串，布尔，数字 ，数组甚至是对象
  不同的名称/值对之间用 逗号 , 隔开

3.访问json对象
  通过 点. 访问JSON对象的属性

4.创建json数组：通过方括号[] 创建JSON 数组
  <script>
   var heros=
     [
        {"name":"盖伦","hp":616},
        {"name":"提莫","hp":313},
        {"name":"死歌","hp":432},
        {"name":"火女","hp":389}
     ]
   document.write("JSON数组大小"+heros.length);
  </script>

5.访问json数组：通过下标访问
  document.write( "第4个英雄是:" +  heros[3].name);

6.JSON对象与JavaScript对象
  JavaScript对象 分内置对象(Number,String,Array,Date,Math)和自定义对象
  JSON就是自定义对象，只不过是以JSON这样的数据组织方式表达出来
  所以不存在JSON对象与JavaScript对象的转换问题

7.字符串转为JSON对象
  通过字符串拼接得到一个JSON结构的字符串，并不是一个JSON对象。 需要通过eval转换得到
  转换的时候注意,eval 函数要以（ 开头，）结尾
  <script>
    var s1 = "{\"name\":\"盖伦\"";
    var s2 = ",\"hp\":616}";
    var s3 = s1+s2;
    document.write("这是一个JSON格式的字符串:" + s3);
    document.write("<br>");
    var gareen = eval("("+s3+")");
    document.write("这是一个JSON对象: " + gareen);
  </script>
  或者使用JQuery的$.parseJSON转换函数

8.JSON对象转换为字符串：JSON.stringify
  json对象因为是一个javascript对象，所以如果直接打印的话，看不到里面的内容。所以需要通过 JSON.stringify 函数把它转换为 字符串。
  <script>
     var hero = {"name":"盖伦","hp":"616"};
     document.write("这是一个json 对象："+ hero);
     document.write("<br>");
     var heroString = JSON.stringify(hero)
     document.write("这是一个json 字符串："+ heroString );
  </script>
*/

}
