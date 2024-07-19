package qianduan.jquery;

/**  JQuery数组操作,,*/
public class Test5 {

/*
1.JQuery数组操作
  (1)遍历 $.each ( a, function(i, n){…}),
    第一个参数a是数组
    第二个参数是回调函数, i是下标，n是内容
    var a = new Array(1,2,3);
    $.each( a, function(i, n){
        document.write( "元素[" + i + "] : " + n + "<br>" );
    })
    document.close();

  (2)去除重复的元素: $.unique(a) 去掉重复的元素
    注意:执行unique之前，要先对数组的内容进行排序a.sort()。

  (3)是否存在: $.inArray(元素,a) 返回元素在数组中的位置 ，如果不存在返回-1

2.JQuery 字符串操作
  (1)去除首尾空白: $.trim(str)

3.JQuery JSON
  (1)将JSON格式的字符串，转换为JSON对象: $.parseJSON(str)
  (2)JSON 对象转换为字符串：JSON.stringify(json对象)

4.对象转换:在某些场景下，需要对JQuery对象和DOM节点对象进行互相转换
  (1)JQuery转DOM: 通过get(0)或者[0] 把JQuery对象转为DOM对象
     var div= $("#d");
     var d = div[0];
  (2)DOM转JQuery通过$(DOM对象) 把DOM对象转为JQuery对象
     var div= document.getElementById("d");
     var d = $(div);
*/

}
