package com.izumi.myobjectstreamTest;

import java.io.*;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /***
         * 需求：将文件中多个序列化后的对象读取到程序中
         */

        // 1. 创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./public/stu.txt"));

        // 2. 读取数据
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        // 3. 释放资源
        ois.close();
    }
}
