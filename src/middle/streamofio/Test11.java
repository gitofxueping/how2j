package middle.streamofio;

public class Test11 {

/* 流关系图
   1.流分为字节流和字符流
   2.字节流下面常用的又有数据流和对象流
   3.字符流下面常用的又有缓存流*/

/* 流关系图
  (1)流分为字节流和字符流
     ① InputStream字节输入流, 抽象类 只提供方法声明 不提供方法的具体实现
        OutputStream字节输出流, 抽象类 只提供方法声明 不提供方法的具体实现
     ② FileInputStream 是InputStream子类, 以FileInputStream 为例进行文件读取
        FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
     ③ Reader字符输入流
        Writer字符输出流
     ④ FileReader 是Reader子类，以FileReader 为例进行文件读取
        FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
  (2)字节流下面常用的又有数据流和对象流
     ① 数据流：DataInputStream 数据输入流，DataOutputStream 数据输出流
        FileInputStream fis  = new FileInputStream(f);
        DataInputStream dis =new DataInputStream(fis);

        FileOutputStream fos  = new FileOutputStream(f);
        DataOutputStream dos =new DataOutputStream(fos);

    ② 对象流：ObjectInputStream 对象输入流，ObjectOutputStream 对象输出流
       //创建对象输入流
       FileInputStream fis = new FileInputStream(f);
       ObjectInputStream ois =new ObjectInputStream(fis);

       //创建对象输出流
       FileOutputStream fos = new FileOutputStream(f);
       ObjectOutputStream oos =new ObjectOutputStream(fos);

    ③ 对象流指的是可以直接把一个对象以流的形式传输给其他的介质，比如硬盘
       一个对象以流的形式进行传输，叫做序列化。 该对象所对应的类，必须是实现Serializable接口。

 (3) 字符流下面常用的又有缓存流
    ① 缓存字符输入流 BufferedReader 可以一次读取一行数据
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);

      PrintWriter 缓存字符输出流， 可以一次写出一行数据
      FileWriter fw = new FileWriter(f); //创建文件字符流
      PrintWriter pw = new PrintWriter(fw); //缓存流必须建立存在的流的基础上
    ② flush：立即把数据写入到硬盘，而不是等缓存满了才写出去。*/

}
