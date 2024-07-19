package qianduan.jquery;

/** JQuery 属性,JQuery 效果,JQuery 事件 */
public class Test3 {

/*
1.JQuery属性
  (1)通过attr()获取一个元素的属性值
    <h1 id="h" align="center" game="LOL">居中标题</h1>
    alert("align属性是:" + $("#h").attr("align") );
  (2)通过attr(attr,value)修改属性
    $("#h").attr("align","right") ;
  (3)通过removeAttr(attr)删除属性
    $("#h").removeAttr("align");
  (4)prop与attr的区别
    prop和attr可以用来获取与设置元素的属性。
    区别在于，对于自定义属性和选中属性的处理。
    选中属性指的是 checked,selected 这2种属性
    ①对于自定义属性 attr能够获取，prop不能获取
    ②对于选中属性
    attr 只能获取初始值， 无论是否变化
    prop 能够访问变化后的值，并且以true|false的布尔型返回。

2.JQuery效果
  (1)显示 隐藏 切换
     显示 隐藏 切换 分别通过show(), hide(),toggle()实现
     也可以加上毫秒数，表示延时操作,比如show(2000)
  (2)向上滑动 向下滑动 滑动切换
     向上滑动 向下滑动 滑动切换 分别通过slideUp(), slideDown(),slideToggle()实现
     也可以加上毫秒数，表示延时操作，比如slideUp(2000)
  (3)回调函数: 需要在调用效果方法的最后一个参数传入一个function，当效果结束的时候，就会自动调用该function了。
     div.animate({left:'0px',top:'50px',height:'50px'},2000,function(){
        alert("动画演示结束");
     }

3.JQuery 事件
  (1)点击：click() 表示单击，dblclick() 表示双击
  (2)鼠标: mousedown 表示鼠标按下，mouseup表示鼠标弹起
  (3)焦点：focus() 获取焦点，blur() 失去焦点
  (4)提交: submit() 提交form表单
  (5)绑定事件：以上所有的事件处理，都可以通过on() 绑定事件来处理
     $("selector").on("event",function);
     $("#b").on("click",function(){
        $("#message").html("单击按钮");
     });
*/

}
