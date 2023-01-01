package com.izumi.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

// FileOutPutStreamд���ݵ����ַ�ʽ
public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b)                      һ��дһ���ֽ�����
            void write(byte[] b)                   һ��дһ���ֽ���������
            void write(byte[] b, int off, int len) һ��дһ���ֽ�����Ĳ�������
         */

        // 1. ��������
        FileOutputStream fos = new FileOutputStream("./a.txt");
        // 2. д������
        // һ��дһ���ֽ�����
        fos.write(97); // a
        fos.write(98); // b

        // һ��дһ���ֽ���������
        byte[] bytes = {97, 98, 99};
        fos.write(bytes);

        // һ��дһ���ֽ�����Ĳ�������
        // ����һ������
        // ����������ʼ����
        // ������������
        fos.write(bytes,1,2);

        // 3. �ͷ���Դ
        fos.close();
    }
}
