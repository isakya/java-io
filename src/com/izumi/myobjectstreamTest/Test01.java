package com.izumi.myobjectstreamTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /***
         * 需求：将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
         */

        // 1. 序列化多个对象
        Student s1 = new Student("张三", 23, "美国");
        Student s2 = new Student("李四", 23, "中国");
        Student s3 = new Student("王五", 23, "乌干达");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./public/stu.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
