package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
            public int read(byte[] buffer) һ�ζ�һ���ֽ���������
         */
        
        // 1. ��������
        FileInputStream fis = new FileInputStream("./a.txt");
        // 2. ��ȡ����
        byte[] bytes = new byte[2];

        // һ�ζ�ȡ����ֽ����ݣ���������٣�������ĳ����й�
        // ����ֵ�����ζ�ȡ���˶��ٸ��ֽ�����
        int len = fis.read(bytes);
        System.out.println(len); // 2
        String str = new String(bytes, 0, len);
        System.out.println(str);

        int len2 = fis.read(bytes);
        System.out.println(len2); // 1
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);

        // 3. �ͷ���Դ
        fis.close();
    }
}
