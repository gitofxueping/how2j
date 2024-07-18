package qianduan;

/** AJAX */
public class Test1 {

/*  通过AJAX(Asynchronous JavaScript And XML) 实现异步刷新
1.	创建XHR对象
2.	设置响应函数
3.	设置要访问的页面
4.	发出请求
5.	当服务端的响应返回，响应函数被调用。
6.	在响应函数中，判断响应是否成功，如果成功获取服务端返回的文本，并显示在span中。

    <span>输入账号 :</span>
    <input id="name" name="name" onkeyup="check()" type="text">
    <span id="checkResult"></span>
    <script>
       var xmlhttp;
       function check(){
          var name = document.getElementById("name").value;
          var url = "https://how2j.cn/study/checkName.jsp?name="+name;

          xmlhttp =new XMLHttpRequest();
          xmlhttp.onreadystatechange=checkResult; //响应函数
          xmlhttp.open("GET",url,true);   //设置访问的页面
          xmlhttp.send(null);  //执行访问
       }

       function checkResult(){
          if (xmlhttp.readyState==4 && xmlhttp.status==200)
              document.getElementById('checkResult').innerHTML=xmlhttp.responseText;
       }
    </script>

7.checkName.jsp
  <%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8" isELIgnored="false"%>

  <%
    String name = request.getParameter("name");

    if("abc".equals(name))
        out.print("<font color='red'>已经存在</font>");
    else
        out.print("<font color='green'>可以使用</font>");
  %>
*/

}
