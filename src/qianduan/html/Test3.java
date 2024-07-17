package qianduan.html;

/**HTML的表单元素*/
public class Test3 {

/*  html的表单元素  注意：<input> 标签很特别，<input> 这样的写法也是满足标准的。一般是不需要写成<input />或者<input></input> 这样的。
    1.文本框: <input type="text"> 即表示文本框,并且只能够输入一行
      设置文本框的长度: 使用属性size, <input type="text" size="10">
      初始值: 使用属性value, <input type="text" value="有初始值的文本框">
      有背景文字的文本框: 使用属placeholder,<input type="text" placeholder="请输入账号">
    2.文本域<textarea>:输入多行，使用属性cols和rows设置宽度和行数。
      <textarea cols="30" rows="8">
    3.密码框: <input type="password">
    4.表单: ① <form>用于向服务器提交数据
              <form action="https://how2j.cn/study/login.jsp"> // action="/study/login.jsp" 表示把账号和密码提交到login.jsp这个页面去
                账号：<input type="text" name="name"> <br/>
                密码：<input type="password" name="password" > <br/>
                <input type="submit" value="登陆">
            </form>
           ② method="get"：提交数据，可以在浏览器的地址栏看到提交的参数。 如果form元素没有提供method属性，默认就是get方式提交数据
            <form method="get" action="https://how2j.cn/study/login.jsp">
               账号：<input type="text" name="name"> <br/>
               密码：<input type="password" name="password" > <br/>
               <input type="submit" value="登陆">
            </form>
           ③method="post":提交数据, post不会在地址栏显示提交的参数
	       ④get和post的区别
            get是form默认的提交方式, 提交数据会在浏览器显示出来
               如果通过一个超链访问某个地址，是get方式
               如果在地址栏直接输入某个地址，是get方式
               不可以用于提交二进制数据，比如上传文件
            post必须在form上通过 method="post" 显示指定,
            提交数据不会在浏览器显示出来
            可以用于提交二进制数据，比如上传文件
     5.单选框: <input type="radio" >
        (1) 默认选中:  <input type="radio" checked="checked" >
        (2)分组: 多个单选框，只能选中一个单选框,设置name属性相同即可
           <p>今天晚上吃什么？</p>
           鱼<input type="radio" name="activity" value="鱼" > <br/>
           鸡<input type="radio" checked="checked"  name="activity" value="鸡" > <br/>
           鸭<input type="radio" name="activity" value="鸭" > <br/>
    6.复选框：<input type="checkbox">
           <p>今天晚上吃什么？</p>
           鱼<input type="checkbox"  value="鱼" > <br/>
           鸡<input type="checkbox" checked="checked"  value="鸡" > <br/>
           鸭<input type="checkbox"  value="鸭" > <br/>
    7.下拉列表:①使用<select>的属性size设置高度
             ②使用<select>的属性multiple设置多选，使用ctrl或者shift进行多选<select size="3" multiple="multiple">
               <select size="2">
                 <option >苍老师</option>
                 <option >高树玛利亚</option>
                 <option >遥美</option>
               </select>
            ③对option元素设置selected="selected" 属性默认选中
               <option selected="selected">遥美</option>
    8.普通按钮 : <input type="button" value="一个按钮">，普通按钮不具备提交form的效果；
    9.提交按钮: <input type="submit">，用于提交form，把数据提交到服务端
    10.重置按钮：<input type="reset">
    11.使用图像进行提交: <input type="image" >
    12.按钮<button>:①如果button的type=“submit” ，那么它就具备提交form的功能;
                   ②<button>按钮标签里的内容可以是文字也可以是图像，
                     button里是文字：<button>按钮</button>
                     button里是图片<button><img src="https://how2j.cn/1.gif"/></button>
*/

}
