package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
            ��ϰ��
                �ļ�����
                �ѣ�./public/��ԭ���� - �h����.mp3 ��������ǰģ����

         */

        // ��ȡ��ǰʱ��
        long start = System.currentTimeMillis();

        // 1. ��������
        FileInputStream fis = new FileInputStream("./public/��ԭ���� - �h����.mp3");
        FileOutputStream fos = new FileOutputStream("./src/com/izumi/mybytestream2/��ԭ���� - �h����.mp3");

        // 2. ����
        int len;
        byte[] bytes = new byte[1024 * 1024 *5];
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        // 3. �ͷ���Դ
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        // ��ǰʱ�� - ����ʱ�� = ����ʱ��
        System.out.println(end - start + "ms");
    }
}
