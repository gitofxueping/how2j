package qianduan.javascript;

/** JavaScriptBOM */
public class Test3 {

/*  JavaScript BOM
    BOM即 浏览器对象模型(Browser Object Model)
    浏览器对象包括:Window(窗口)，Navigator(浏览器)，Screen (客户端屏幕)，
    History(访问历史)，Location(浏览器地址)
1.Window(窗口) 一旦页面加载，就会自动创建window对象
    (1)获取文档显示区域的高度和宽度: window.innerHeight和window.innerWidth,
    (2)获取外部窗体即浏览器的高度和宽度: window.outerHeight，window.outerWidth
    (3)警告框用的是window.alert("警告内容")，因为很常用，所以就把window省略掉，直接使用alert
2.Navigator(浏览器)，提供浏览器相关的信息
    浏览器产品名称: navigator.appName
    浏览器版本号: navigator.appVersion
    操作系统: navigator.platform
    是否启用Cookies: navigator.cookieEnabled
    浏览器的用户代理报头: navigator.userAgent
3.Screen (客户端屏幕) Screen对象表示用户的屏幕相关信息
    用户的屏幕大小screen.height，以及可用屏幕大小screen.availHeight
    可用区域的高度会比屏幕高度小一点，因为有任务栏的存在。
4.History(访问历史) 用于记录访问历史
    返回上一次的访问: history.back();
    返回上上次的访问: history.go(-2); //-1表示上次，-2表示上上次，以次类推
5.Location(浏览器地址) Location表示浏览器中的地址栏
    刷新当前页面:location.reload();
    跳转到另一个页面:location.assign("/");
6.弹出框
    (1)警告框用的是window.alert("警告内容")，因为很常用，所以就把window省略掉，直接使用alert
    (2)确认框confirm常用于危险性操作的确认提示。 比如删除一条记录的时候，弹出确认框。confirm:返回基本类型的Boolean true或者false
       var d = confirm("是否要删除");
       alert(typeof d + " " + d);
    (3)输入框 prompt
       var name = prompt("请输入用户名:");
       alert("您输入的用户名是:" + name);
7.计时器
    (1)只执行一次:函数setTimeout(functionname, 距离开始时间毫秒数 );
       通过setTimeout在制定的毫秒数时间后，执行一次 函数functionname
    (2)不停地重复执行: 函数setInterval(函数名, 重复执行的时间间隔毫秒数 );
       通过setInterval重复执行同一个函数，重复的时间间隔由第二个参数指定
    (3)终止重复执行: clearInterval(t) 通过clearInterval终止一个不断重复的任务;
       <div id="time"></div>
       <script>
           var t = setInterval(printTime,1000);
           function printTime(){
               var d = new Date();
               var h= d.getHours();
               var m= d.getMinutes();
               var s= d.getSeconds();
               document.getElementById("time").innerHTML= h+":"+m+":"+s;
               if(s%5==0)
                   clearInterval(t);
           }
      </script>
    (4)不要在重复执行setInterval调用的函数中使用document.write();
*/


}
