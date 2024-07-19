package qianduan.jquery;

/**JQuery概念和常见方法*/
public class Test1 {

/*
1.JQuery概念
  (1)JQuery是一个javascript的框架，是对javascript的一种封装。
     通过JQuery可以非常方便的操作html的元素
  (2)理解 $(function(){}) : 表示文档加载
  (3)通过id获取元素：$("#id")
     通过 document.getElementById 获取到的是 DOM里的元素节点
     通过$("#id") 获取到的是一个 JQuery对象
  (4)JQuery增加click事件的监听
     <script src="https://how2j.cn/study/jquery.min.js"></script>
     <script >
     $(function(){
        $("#b1").click(function(){
            alert("点击了按钮");
        });
     });
     </script>
     <button id="b1">按钮</button>
    这个也是由两部分组成：① b1按钮的点击事件：$("#b1").click();
                      ② 弹出对话框的函数：
                         function(){
                            alert("点击了按钮");
                         }

2.	常见方法
    (1)取值: 通过JQuery对象的val()方法获取值
       相当于document.getElementById("input1").value;
       <script>
       $(function(){
           $("#b1").click(function(){
              alert($("#input1").val());
           });
       });
       </script>
       <button id="b1">取值</button>
       <br>
       <br>
       <input type="text" id="input1" value="默认值">
    (2)通过html()①获取元素内容,如果有子元素，保留标签，②赋值
       <script src="https://how2j.cn/study/jquery.min.js"></script>
       <script>
       $(function(){
          $("#b1").click(function(){
              alert($("#d1").html());
          });
       });
       </script>
       <button id="b1">获取文本内容</button>
       <br>
       <br>
       <div id="d1">
          这是div的内容
            <span>这是div里的span
            </span>
       </div>
    (3)通过text() 获取元素内容,如果有子元素，不包含标签
       alert($("#d1").text());
*/

}
