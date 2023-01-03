package com.izumi.myobjectstreamTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /***
         * ���󣺽�����Զ���������л����ļ��У����Ƕ���ĸ�����ȷ��������β����أ�
         */

        // 1. ���л��������
        Student s1 = new Student("����", 23, "����");
        Student s2 = new Student("����", 23, "�й�");
        Student s3 = new Student("����", 23, "�ڸɴ�");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./public/stu.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
