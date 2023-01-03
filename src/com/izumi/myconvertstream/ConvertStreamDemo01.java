package com.izumi.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

// ����ת��������ָ���ַ������ȡ
public class ConvertStreamDemo01 {

    public static void main(String[] args) throws IOException {
        /*
            // 1. ��������ָ���ַ�����(�˽�)
            // JDK11�����ַ�ʽ����̭��
            InputStreamReader isr = new InputStreamReader(new FileInputStream("./public/utf8file.txt"), "UTF-8");

            // 2. ��ȡ����
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char)ch);
            }

            // 3. �ͷ���Դ
            isr.close();
        */



        /*

            // JDK8��֧�֣����Ա���
            FileReader fr = new FileReader("./public/utf8file.txt", Charset.forName("GBK"));
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();

         */
    }
}
