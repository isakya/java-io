package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

// ���󣺶�ȡ�ļ��е����ݡ�����ʱ��д���ģ�
public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
            �ֽ�������FileInputStream��
                1. �����ֽ�����������
                2. д����
                3. �ͷ���Դ
         */

        // 1. ��������
        FileInputStream fis = new FileInputStream("./a.txt");

        // 2. ��ȡ����
        int b1;
        while((b1 = fis.read()) != -1) {
            System.out.println((char)b1);
        }

        // 3. �ر���Դ
        fis.close();
    }
}
