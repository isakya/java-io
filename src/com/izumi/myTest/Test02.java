package com.izumi.myTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// �����ļ�����
public class Test02 {
    public static void main(String[] args) throws IOException {

        // ^:���
        // һ�����������һ����2�λ��ǵõ������

        // 1. �����������ԭʼ�ļ�
        FileInputStream fis = new FileInputStream("./public/izumi.jpg");
        // 2. ����������������ļ�
        FileOutputStream fos = new FileOutputStream("./public/izumi-eny.jpg");
        // 3. ���ܴ���
        int b;
        while((b = fis.read())!=-1) {
            fos.write(b ^ 2);
        }
        // 4. �ͷ���Դ
        fos.close();
        fis.close();

        // ����ֱ�Ӱѹ����ļ�����һ�¾Ϳ�����
    }
}


