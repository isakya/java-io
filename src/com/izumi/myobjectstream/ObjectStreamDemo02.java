package com.izumi.myobjectstream;

import java.io.*;

public class ObjectStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /***
         * �������÷����л���/������������������ļ��еĶ������������
         *
         * ���췽����
         *          public ObjectInputStream(OutputStream out) �ѻ�������ɸ߼���
         * ��Ա������
         *          public Object readObject(Object obj)       �����л��������ļ��еĶ��󣬶�ȡ����������
         */


        // 1. ���������л����Ķ���/�������������
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./public/oos.txt"));

        // 2. ��ȡ����
        Student o = (Student) ois.readObject();
        System.out.println(o);

        // 3. �ͷ���Դ
        ois.close();
    }
}
