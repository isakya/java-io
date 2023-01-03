package com.izumi.myobjectstream;

import java.io.*;

public class ObjectStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /***
         * 需求：利用反序列化流/对象操作输入流，把文件中的对象读到程序当中
         *
         * 构造方法：
         *          public ObjectInputStream(OutputStream out) 把基本流变成高级流
         * 成员方法：
         *          public Object readObject(Object obj)       把序列化到本地文件中的对象，读取到程序中来
         */


        // 1. 创建反序列化流的对象/对象操作输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./public/oos.txt"));

        // 2. 读取数据
        Student o = (Student) ois.readObject();
        System.out.println(o);

        // 3. 释放资源
        ois.close();
    }
}
