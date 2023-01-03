package com.izumi.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /***
         * �����������л���/����������������һ������д�������ļ���
         *
         * ���췽����
         *          public ObjectOutStream(OutputStream out) �ѻ�������ɸ߼���
         * ��Ա������
         *          public final void writeObject(Object obj) �Ѷ������л���д�������ļ���ȥ
         */

        // 1. ��������
        Student stu = new Student("С��", 30);

        // 2. �������л����Ķ���/������������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./public/oos.txt"));

        // 3. д������
        oos.writeObject(stu);

        // 4. �ͷ���Դ
        oos.close();
    }
}
