package com.izumi.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

//����д��һ�����ֵ������ļ��С�����ʱ��д���ģ�
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. ��������
        FileOutputStream fos = new FileOutputStream("./a.txt");
        // 2. д������
        fos.write(97);
        // 3. �ͷ���Դ
        fos.close();
    }
}
