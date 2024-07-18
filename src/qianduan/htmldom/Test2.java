package qianduan.htmldom;

/** HTML DOM事件*/
public class Test2 {

/*  DOM事件
 1.焦点事件:
       当组件获取焦点的时候，会触发onfocus事件
       当组件失去焦点的时候，会触发onblur事件
       <input type="text" onfocus="f()" onblur="b()" id="input1" placeHolder="输入框1" >
       <div id="message"></div>
       <script>
          function f(){
             document.getElementById("message").innerHTML="输入框1获取了焦点";
          }

          function b(){
             document.getElementById("message").innerHTML="输入框1丢失了焦点";
          }
       </script>

 2. 鼠标事件:由鼠标按下，鼠标弹起，鼠标经过几个事件组成
    当在组件上鼠标按下的时候，会触发onmousedown事件
    当在组件上鼠标弹起的时候，会触发onmouseup事件
    当在组件上鼠标经过的时候，会触发onmousemove事件

 3. 点击事件:由单击，双击按两个事件组成
    当在组件上单击的时候，会触发onclick事件
    当在组件上双击的时候，会触发ondblclick事件
    自定义函数不要使用click()，这是保留函数名

 4.提交事件：onsubmit事件
    当form元素提交的时候，会触发onsubmit事件

 5.加载事件: 当整个文档加载成功，或者一个图片加载成功，会触发加载事件
   当body元素或者img加载的时候，会触发onload事件

 6.当前组件：this表示触发事件的组件，可以在调用函数的时候，作为参数传进去

 7.阻止事件的发生：
    比如在提交一个表单的时候，如果用户名为空，弹出提示，并阻止提交
    ①在调用函数的时候，增加一个return
    ②在函数中，如果发现用户名为空，则返回false
    ③当onSubmit得到的返回值是false的时候，表单的提交功能就被取消了
*/

}
