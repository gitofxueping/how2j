package qianduan.css;

/** CSS的基础：css把颜色，大小位置等信息剥离到<style>中，而html只用关心提供什么样的内容就行了 */
public class Test1 {

/*  CSS的基础：css把颜色，大小位置等信息剥离到<style>中，而html只用关心提供什么样的内容就行了。
    <style>
      td{
        background-color:gray;
      }
    </style>

    <table border="1">
       <tr >
         <td>1</td>
         <td>2</td>
       </tr>
    </table>

   1.CSS语法:(1)直接在某一个元素上增加style属性   <p style="color:red">这是style为红色的</p>
            (2) 选择器{属性:值}，选择器主要分3种：元素选择器，id选择器，类选择器
     ①元素选择器:通过标签名选择元素
       <style>
         p{
           color:red;
         }
       </style>
     ②id选择器：通过id选择元素
       <style>
         #p1{
           color:blue;
         }
       </style>

       <p>没有id的p</p>
       <p id="p1">id=p1的p</p>
     ③类选择器: 多个元素使用同样的css
       <style>
         .pre{
           color:blue;
         }
       </style>

       <p class="pre">前3个</p>
       <p class="pre">前3个</p>
       <p class="after">后3个</p>
       <p class="after">后3个</p>
     ④更准确的选择：同时根据元素名和class来选择
    2.尺寸：属性width值：可以是百分比或者像素
    3.背景：
     (1)背景颜色background-color
     (2)图片做背景background-image:url(imagepath);
     (3)背景重复：background-repeat属性,值可以选:
           repeat;水平垂直方向都重复
           repeat-x;只有水平方向重复
           repeat-y; 只有垂直方向重复
           no-repeat; 无重复
     (4)背景平铺: 属性：background-size，值：contain
   4.文本
     (1)文字颜色:
     (2)对齐: 属性:text-align，值：left,right,center
     (3)文本修饰: 属性：text-decoration，值:overline，underline
     (4)行间距: 属性：line-height，值：数字或者百分比
     (5)字符间距: 属性：letter-spacing，值： 数字
     (6)单词间距：属性：word-spacing，值： 数字
     (7)首行缩进：属性：text-indent，值： 数字
     (8)大小写: 属性：text-transform，值：uppercase 全部大写,capitalize 首字母大写,lowercase 全部小写
   5.字体
     (1)尺寸: 属性font-size，值：数字或者百分比
     (2)风格: 属性font-style，normal 标准字体，italic 斜体
     (3)粗细：属性font-weight，normal 标准粗细，bold 粗一点
     (4)字库：属性font-family
     (5)把大小，风格，粗细，字库都写在一行里面：
           font:italic bold 30px "Times New Roman";
   6.鼠标样式：属性cursor
        cursor:crosshair: 鼠标移动到这段文字上，就看到鼠标样式变成十字架
   7.表格
     (1)表格布局 属性:table-layout，值: automatic或 fixed
        automatic:单元格的大小由td的内容宽度决定
        fixed:单元格的大小由td上设置的宽度决定
     (2)表格边框 属性：border-collapse， 值：separate:边框分隔，collapse:边框合并
   8.元素边框
     (1)边框风格：属性： border-style, 值：solid: 实线，dotted:点状，dashed:虚线，double:双线
     (2)边框颜色: border-color
     (3)边框宽度：border-width
     (4)颜色 风格 宽度都放一起 border
        border:1px dotted LightSkyBlue;
     (5)只有一个方向有边框：通过制定位置，可以只给一个方向设置边框风格，颜色和宽度
        border-top-style:solid;
        border-top-color:red;
        border-top-width: 50px;
     (6)块级元素和内联元素的边框区别
        块级元素默认是占用100%的宽度，常见的块级元素有div h1 p 等
        内联元素宽度由其内容的宽度决定，常见的内联元素有 span a b strong i input 等
   9.内边距：元素里的内容与边框之间的距离,属性：
        padding-left: 左内边距,
        padding-right: 右内边距,
        padding-top: 上内边距,
        padding-bottom: 下内边距
        padding: 如果只写一个，即四个方向的值;如果写四个，即上 右 下 左,依顺时针的方向依次赋值
   10.外边距：元素边框和元素边框之间的距离, 属性: margin-left,值：数字
        margin-left: 左外边距
        margin-right: 右外边距
        margin-top: 上外边距
        margin-bottom: 下外边距
   11.边框模型
   12.超链状态：4种
        link - 初始状态，从未被访问过
        visited - 已访问过
        hover - 鼠标悬停于超链的上方
        active - 鼠标左键点击下去，但是尚未弹起的时候
        去除超链的下划线： text-decoration: none
   13.隐藏
        display:none隐藏一个元素，这个元素将不再占有原空间 “坑” 让出来了
        visibility:hidden隐藏一个元素，这个元素继续占有原空间，只是“看不见”
   14.Css文件
        如果把所有的css都写在html文件里面，一旦样式比较多的时候，就会显得不易维护
        这个时候就会选择把所有的css内容，放在一个独立文件里，然后在html中引用该文件，通常这个文件会被命名为style.css。
        <link rel="stylesheet" type="text/css" href="file://d:/style.css"" />
   15.优先级：如果style.css中，<style>标签中，style属性上有冲突的样式，那么谁的优先级更高？
        style标签与外部文件style.css样式重复：优先使用： 最后出现的一个；
        style标签上的与style属性冲突：优先使用style属性;
        !important ：如果样式上增加了!important，则优先级最高，甚至高于style属性
*/

}
