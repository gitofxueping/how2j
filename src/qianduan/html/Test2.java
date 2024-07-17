package qianduan.html;

/**html的基本元素*/
public class Test2 {

/*  html的基本元素
    1.标题: 一般会使用<h1> 到 <h6> 表示不同大小的标题，<h1>标题1</h1>
    2.段落: <p>,自带换行效果
    3.粗体:<b>,<strong> 都可以用来实现粗体的效果, 推荐使用<strong>
    4.斜体: <i>和<em>都可以用来实现斜体的效果
           <strong><i>同时有粗体和斜体</i></strong>
    5.预格式: < pre > 作用：在网页上显示代码，比如java代码，
    6.下划线：<ins>
    7.图像:①<img src=” file://d:/example.gif”/>
          ②设置图像大小：<img width="200" height="200" src=" example.gif"/>
          ③img不能够自己居中，需要放在其他能够居中的标签中实现这个效果，比如h1标签,p标签。经常采用的手段是放在div中居中。
          ④换图片的文字:alt属性。当图片存在的时候，alt是不会显示的；当图片不存在的时候，alt就会出现。
            <img src=" example.gif" alt="这个是一个图片" />
            <img src=" example_not_exist.gif" alt="这个是一个图片" />
    8.超链: ①<a href="跳转到的页面地址">超链显示文本</a>
             <a href="https://www.baidu.com">百度</a>

             <a href="http://www.12306.com">
               <img src="https://how2j.cn/example.gif"/>
             </a>

           ②在新的页面打开超链，新增属性target
            <a href="https://www.baidu.com" target="_blank">百度</a>
           ③title超链上的提示文字: 当鼠标放在超链上的时候，就会弹出提示文字
            <a href="https://www.baidu.com" title="跳转到百度">百度2</a>
    9.表格: <table>标签用于显示一个表格，<tr> 表示行，<td> 表示列又叫单元格
      带边框的表格：设置table的属性border，<table border="1">
      设置table宽度：设置table的属性 width，<table border="1" width="200px">
      单元格宽度绝对值：设置td的属性width， <td width="50px">1</td>
      单元格宽度相对值：设置td的属性width为百分数,  <td width="80%">1</td>
      单元格水平对齐: 设置td的属性align, <td width="50%" align="left">1</td>
      单元格垂直对齐: 设置td的属性valign,  <td  valign="top" >1</td>
      横跨两列, 水平合并: 设置td的属性colspan
      横跨两行, 垂直合并：设置td的属性rowspan
      背景色：设置tr或者td的属性bgcolor
      列表: 列表分无序列表<ul>标签和有序列表<ol>标签
            <ul>:
              <li>DOTA</li>
              <li>LOL</li>
            </ul>
    10.块：<div>和<span>都是布局用的，通常是用来结合css进行页面布局。
    div和span的区别：div是块元素，即自动换行，常见的块元素还有h1,table,p；
    span是内联元素，即不会换行，常见的内联元素还有img,a,b,strong；
    11.字体: font常用的属性有 color和size, 分别表示颜色和大小；
    12.内联框架: iframe相当于有个小浏览器，在这个小浏览器中，打开另一个网页；
       <iframe src="https://how2j.cn/" width="600px" height="400px">
       </iframe>
*/

}
