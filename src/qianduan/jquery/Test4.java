package qianduan.jquery;

/** JQuery AJAX */
public class Test4 {

/*
1.JQuery AJAX
  (1)提交AJAX请求
     $.ajax({
        url: page,
        data:{"name":value},
        success: function(result){
            $("#checkResult").html(result);
        }
    });

    $.ajax采用参数集的方式 {param1,param2,param3} 不同的参数之间用,隔开
    第一个参数 url:page 表示访问的是page页面
    第二个参数 data:{name:value} 表示提交的参数
    第三个参数 success: function(){} 表示服务器成功返回后对应的响应函数

  (2)使用get方式提交ajax：$.get 是 $.ajax的简化版，专门用于发送GET请求
     $.get(
       page,
       {"name":value},
       function(result){
         $("#checkResult").html(result);
       }
    );

    $.get 使用3个参数，只有第一个参数是必须的，其他参数都是可选

    <script src="https://how2j.cn/study/jquery.min.js"></script>
    <div id="checkResult"></div>
    输入账号 :<input id="name" type="text">
    <script>
    $(function(){
        $("#name").keyup(function(){
            var page = "/study/checkName.jsp";
            var value = $(this).val();
            $.get(
                 page,
                 {"name":value},
                 function(result){
                    $("#checkResult").html(result);
                 }
            );
        });
     });
     </script>

  (3)使用post方式提交ajax: $.post 是 $.ajax的简化版，专门用于发送POST请求
     $.post(
        page,
        {"name":value},
        function(result){
           $("#checkResult").html(result);
        }
     );

    $.post 使用3个参数, 只有第一个参数是必须的，其他参数都是可选

  (4)最简单的调用ajax的方式
    $("#id").load(page,[data]);
    id: 用于显示AJAX服务端文本的元素Id
    page: 服务端页面
    data: 提交的数据，可选。 在本例中，直接在page里加上了参数列表

  (5)格式化form下的输入数据: serialize()
    有的时候form下的输入内容比较多，一个一个的取比较麻烦，就可以使用serialize() 把输入数据格式化成字符串
    var data = $("#form").serialize();

    <a href="https://how2j.cn/study/checkName.jsp">https://how2j.cn/study/checkName.jsp</a>
    <form id="form">
    输入账号 :<input id="name" type="text" name="name"> <br>
    输入年龄 :<input id="age" type="text" name="age"> <br>
    输入手机号码 :<input id="mobile" type="text" name="mobile"> <br>
    </form>

    <script>
    $(function(){
        $("input").keyup(function(){
            var data = $("#form").serialize();
            var url = "https://how2j.cn/study/checkName.jsp";
            var link = url+"?"+ data;
            $("a").html(link);
            $("a").attr("href",link);
        });
    });
    </script>
*/

}
