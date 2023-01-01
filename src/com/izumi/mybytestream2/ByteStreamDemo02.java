package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    /*
        ��ϰ��
            �����ļ�
            ��./public/movie.mp4��������ǰģ���¡�
        ע�⣺
            ѡ��һ���Ƚ�С���ļ�
     */

    public static void main(String[] args) throws IOException {
        // 1. ��������
        FileInputStream fis = new FileInputStream("./public/movie.mp4");
        FileOutputStream fos = new FileOutputStream("./src/com/izumi/mybytestream2/copy.mp4");

        // 2. ����
        // ����˼�룺�߶���д
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 3. �ͷ���Դ
        // �����ȿ����������ر�
        fos.close();
        fis.close();
    }
}
