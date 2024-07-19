package qianduan.jquery;

/** JQuery CSS,JQuery 选择器,JQuery 筛选器*/
public class Test2 {

/*
1.JQuery CSS
  (1)增加class: 通过addClass() 增加一个样式中的class
    $("div").addClass("pink");
  (2)删除class: 通过removeClass() 删除一个样式中的class
    $("#d").removeClass("pink");
  (3)切换class: 通过toggleClass() 切换一个样式中的class
    这里的切换，指得是：如果存在就删除;如果不存在就添加
    $("#d").toggleClass("pink");
  (4)css函数: 通过css函数 直接设置样式
     ①css(property,value)
       $("#d1").css("background-color","pink");
     ②css({p1:v1,p2:v2}),参数是 {} 包含的属性值对。
       $("#d2").css({"background-color":"pink","color":"green"});
       属性值对之间用 逗号，分割
       属性和值之间用 冒号 ：分割
       属性和值都需要用引号 “

2.JQuery 选择器
  (1)元素：$("tagName")，根据 标签名 选择所有该标签的元素
  (2)Id: $("#id") ，根据 id 选择元素
  (3)类：$(".className")，根据 class 选择元素
  (4)层级：$("selector1 selector2")，选择 selector1下的selector2元素
  (5)最先最后：
    $(selector:first) 满足选择器条件的第一个元素
    $(selector:last) 满足选择器条件的最后一个元素
 （6)奇偶：
    $(selector:odd) 满足选择器条件的奇数元素
    $(selector:even) 满足选择器条件的偶数元素
    因为是基零的，所以第一排的下标其实是0(是偶数)
  (7)属性
    $(selector[attribute]) 满足选择器条件的有某属性的元素
    $(selector[attribute=value]) 满足选择器条件的属性等于value的元
    $(selector[attribute!=value]) 满足选择器条件的属性不等于value的元素
    $(selector[attribute^=value]) 满足选择器条件的属性以value开头的元素
    $(selector[attribute$=value]) 满足选择器条件的属性以value结尾的元素
    $(selector[attribute*=value]) 满足选择器条件的属性包含value的元素
 (8)表单对象
    表单对象选择器 指的是选中form下会出现的输入元素
    :input 会选择所有的输入元素，不仅仅是input标签开始的那些，还包括textarea,select和button
    :button 会选择type=button的input元素和button元素
    :radio 会选择单选框
    :checkbox会选择复选框
    :text会选择文本框，但是不会选择文本域
    :submit会选择提交按钮
    :image会选择图片型提交按钮
    :reset会选择重置按钮
 (9)当前元素: 在监听函数中使用 $(this)，即表示触发该事件的组件。

3.JQuery筛选器：筛选器指的是在已经通过选择器选中了元素后，在此基础上进一步选择。
 (1)首先通过 $("div") 选择了多个div元素，接下来做进一步的筛选
    first() 第1个元素:  $("div").first().toggleClass("pink");
    last() 最后一个元素
    eq(num) 第num个元素,注: num基0
 (2)父 祖先
    parent() 选取最近的一个父元素
    parents() 选取所有的祖先元素
    $("#currentDiv").parent().toggleClass("b");
 (3)儿子 后代
    children(): 筛选出儿子元素 (紧挨着的子元素)
    find(selector): 筛选出后代元素,注: find() 必须使用参数 selector
    $("#currentDiv").find("div").toggleClass("b");
 (4)同级: siblings(): 同级(同胞)元素
    $("#currentDiv").siblings().toggleClass("b");
*/

}
