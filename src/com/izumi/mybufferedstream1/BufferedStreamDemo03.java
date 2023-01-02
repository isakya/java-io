package com.izumi.mybufferedstream1;

import java.io.*;

// �ַ�������������
public class BufferedStreamDemo03 {
    /**
     * �ַ�������������
     * ���췽����
     *      public BufferedReader(Reader r)
     * ���з�����
     *      public String readLine() // ��һ����
     */


    public static void main(String[] args) throws IOException {
        // 1. �����ַ������������Ķ���
        BufferedReader br = new BufferedReader(new FileReader("./public/bis.txt"));
        // 2. ��ȡ����
        // ϸ�ڣ�
        // readLine�����ڶ�ȡ��ʱ��һ�ζ�һ���У������س����н���������������ѻس����ж����ڴ浱��
        String line1 = br.readLine();
        System.out.println(line1);

        String line2 = br.readLine();
        System.out.println(line2);

        // ѭ����ȡ��ע�������󷵻ص���null
        String line3;
        while ((line3 = br.readLine()) != null) {
            System.out.println(line3);
        }

        // 3. �ͷ���Դ
        br.close();
    }
}
