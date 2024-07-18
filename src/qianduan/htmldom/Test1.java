package qianduan.htmldom;

/** HTML DOM的概念及节点获取*/
public class Test1 {

/*  DOM 是Document Object Model( 文档对象模型 )的缩写。
    DOM是把html里面的各种数据当作对象进行操作的一种思路。
1.节点概念：DOM把所有的html都转换为节点
    整个文档 是一个节点
    元素 是节点
    元素属性 是节点
    元素内容 是节点
    注释 也是节点
2.获取节点：
    (1)	通过id获取元素节点: document.getElementById()
    (2)	通过标签名称获取元素节点: document.getElementsByTagName(“p”)
    (3)	通过类名获取元素节点: document.getElementsByClassName(“Hero”)
    (4)	通过表单元素的name属性的值获取元素节点
        表单元素都有name属性，通过getElementsByName可以根据name属性的值，获取元素节点。
        用户名 <input name="userName">
        var elements= document.getElementsByName("userName");
    (5)	获取属性节点
        首先通过getElementById获取元素节点，
        然后通过元素节点的attributes获取其下所有的属性节点。
        因为属性节点是多个，所以是以数组的形式返回出来的，接着通过for循环遍历，查看每个节点的nodeName和nodeValue
        如果要获取一个指定属性的值，可以采用如下风格，as表示所有的属性，as["id"]取出属性名称是id的属性

        <html>
        <div id="d1" align="center" class="abc">hello HTML DOM</div>
        <script>
            var  div1 = document.getElementById("d1");
            var as = div1.attributes;
            document.write("div总共有"+as.length +" 个属性");
            document.write("分别是:");
            for(i = 0; i< as.length; i++){
               document.write("<br>");
               document.write(as[i].nodeName);
               document.write(":");
               document.write(as[i].nodeValue);
            }
            document.write("<br>");
            document.write("div的id属性值是："+ as["id"].nodeValue);
       </script>
       </html>

    (6)	获取内容节点
        首先通过document.getElementById获取元素节点，
        然后通过childNodes获取其所有的子节点。
        其中第一个子节点，就是其内容节点。
        借助nodeName和nodeValue把内容节点的名称和值打印出来。
        <html>
        <div id="d1" align="center" class="abc">hello HTML DOM</div>
        <script>
            var div1 = document.getElementById("d1");
            var content = div1.childNodes[0];
            document.write("div的内容节点名是:"+content.nodeName);
            document.write("<br>");
            document.write("div的内容节点值是:"+content.nodeValue);
        </script>
        </html>

3.节点
    (1)	节点名称: nodeName
        document.nodeName 文档的节点名，是 固定的#document
        div1.nodeName 元素的节点名，是对应的标签名 div
        div1.attributes[0].nodeName 属性的节点名，是对应的属性名 id
        div1.childNodes[0].nodeName 内容的节点名，是固定的 #text
    (2)	节点值: nodeValue表示一个节点的值
        <div id="d1">hello HTML DOM</div>
        document.nodeValue 文档的节点值，是 null
        div.nodeValue 元素的节点值，是null
        div.attributes[0].nodeValue 属性的节点值，是对应的属性值 d1
        div.childNodes[0].nodeValue 内容的节点值，是内容 即：hello HTML DOM
    (3)	节点类型值：不同的节点类型，对应的节点类型值nodeType是不一样的
        document.nodeType 文档的节点类型，是 9
        div1.nodeType 元素的节点类型，是 1
        div1.attributes[0].nodeType 属性的节点类型，是 2
        div1.childNodes[0].nodeType 内容的节点类型，是 3
    (4)	元素的文本内容
        ①修改与获取内容的值可以通过 childNodes[0].nodeValue进行
          document.getElementById("d1").childNodes[0].nodeValue= "通过childNode[0].value改变内容";
        ②通过innerHTML进行
          document.getElementById("d1").innerHTML= "通过innerHTML改变内容";
    (5)	元素上的属性访问
        元素上的属性，比如id,value 可以通过 . 直接访问；
        input1.id = input1
        input1.value = 这是一个输入框
        元素是自定义属性，那么可以通过如下两种方式来获取：
        ①getAttribute("test")
        ②attributes["test"].nodeValue
          <input id="input1" class="class1" test="t1" value="这是输入框">
          input1.className = class1
          input1.getAttribute("test") = t1
          input1.attributes["test"].nodeValue = t1


4.样式
    (1)	隐藏和显示: 通过给元素的style.display 赋值，改变显示还是隐藏
    var d = document.getElementById("d");
    d.style.display="none"; //隐藏
    d.style.display="block"; //显示

    (2)	改变背景色：style.backgroundColor
    d.style.backgroundColor="green";
*/

}
