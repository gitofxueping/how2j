package qianduan.htmldom;

/** 节点关系,创建节点，删除节点，插入节点，替换节点 */
public class Test3 {

/*
1.节点关系
    (1)	父节点关系：通过parentNode获取父节点
    (2)	同胞节点关系：分别通过 previousSibling和nextSibling属性获取前一个，以及后一个同胞节点。
    (3)	子节点关系
        firstChild 第一个子节点
        lastChild 最后一个子节点
        childNodes 所有子节点
        注:firstChild 如果父节点的开始标签和第一个元素的开始标签之间有文本、空格、换行，
          那么firstChild第一个子节点将会是文本节点，不会是第一个元素节点。
    (4)	childNodes和children的区别
        childNodes和children都可以获取一个元素节点的子节点。
        childNodes 会包含文本节点
        children 会排除文本节点

2.创建节点
    (1)	创建元素节点：createElement
        通过createElement 创建一个新的元素节点，
        接着把该元素节点，通过appendChild加入到另一个元素节点div1中
        var hr=document.createElement("hr");
        var div1 = document.getElementById("d");
        div1.appendChild(hr);
    (2)	创建文本节点
        首先创建一个元素节点p (p是p标签，不是随便命名的变量名)
        接着通过createTextNode创建一个内容节点text
        把text加入到p
        再把p加入到div
    (3)	创建属性节点
        首先创建一个元素节点a
        接着创建一个内容节点content
        把content加入到a
        然后通过createAttribute创建一个属性节点 href
        设置href的值为http:12306.com
        通过setAttributeNode把该属性设置到元素节点a上
        最后把a加入到div
3.删除节点
    (1)	删除元素节点：
        第一步：先获取该元素和该元素的父节点
        第二步：通过父节点，调用removeChild 删除该节点
    (2)	删除文本节点
        第一步：先获取文本节点的父节点
        第二步：通过父节点.innerHTML=""的方式
    (3)	删除属性节点
        第一步：先获取该元素节点
        第二步：元素节点调用removeAttribute删除指定属性节点
4.替换节点：获取父节点，然后通过父节点替换子节点。
    (1)获取父节点
    (2)创建子节点
    (3)获取被替换子节点
    (4)通过replaceChild进行替换：parentDiv.replaceChild(d4,d3)
    注: replaceChild 第一个参数是保留的节点，第二个参数是被替换的节点
4.插入节点
    (1)	追加节点：通过appendChild追加节点。 追加节点是把新的节点插在最后面
        ①创建新节点
        ②获取父节点
        ③通过appendChild追加
    (2)	在前方插入节点：insertBefore
        ①创建新节点
        ②获取父节点
        ③获取需要加入的子节点
        ④通过insertBefore插入：parentDiv.insertBefore(d25,d3);
       注: insertBefore的第一个参数是新元素，第二个参数是插入位置
*/

}
