package com.izumi.mybufferedstream1;

import java.io.*;

// �ַ������������
public class BufferedStreamDemo04 {
    /**
     * �ַ�������������
     * ���췽����
     *      public BufferedWriter(Reader r)
     * ���з�����
     *      public String newLine() // ��ƽ̨�Ļ���
     */


    public static void main(String[] args) throws IOException {
        // 1. �����ַ������������Ķ���
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/bos.txt", true));
        // 2. д������
        bw.write("����������������ÿ���");
        bw.newLine();
        bw.write("�����л��㱻���");
        // 3. �ͷ���Դ
        bw.close();
    }
}
