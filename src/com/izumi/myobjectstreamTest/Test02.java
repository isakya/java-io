package com.izumi.myobjectstreamTest;

import java.io.*;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /***
         * ���󣺽��ļ��ж�����л���Ķ����ȡ��������
         */

        // 1. ���������л����Ķ���
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./public/stu.txt"));

        // 2. ��ȡ����
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        // 3. �ͷ���Դ
        ois.close();
    }
}
