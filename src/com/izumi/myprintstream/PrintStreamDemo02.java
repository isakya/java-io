package com.izumi.myprintstream;

import java.io.*;

public class PrintStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /***
         * �ַ���ӡ����
         *      ���췽��
         *          public PrintWriter(Writer/File/String)            �����ֽ������/�ļ�/�ļ�·��
         *          public PrintWriter(String fileName, Charset charset)    ָ���ַ�����
         *          public PrintWriter(Writer, boolean autoFlush)    �Զ�ˢ��
         *          public PrintWriter(Writer out, boolean autoFlush, String encoding)    ָ���ַ������Ҵ����Զ�ˢ�¹���
         *
         *      ��Ա����
         *          public void write(int b)    ���淽���������֮ǰһ������ָ�����ֽ�д��
         *          public void println(Xxx xx)    ���з�������ӡ�������ݣ��Զ�ˢ�£��Զ�����
         *          public void print(Xxx xx)    ���з�������ӡ�������ݣ�������
         *          public void printf(String format, Object... args)    ���з���������ռλ���Ĵ�ӡ��䣬������
         */

        // 1. �����ֽڴ�ӡ���Ķ���
        PrintWriter ps = new PrintWriter(new FileWriter("./d.txt"), true);
        // 2. д������
        ps.println("�����л��㱻����򣬻�������򣬻����");
        ps.print("���");
        ps.printf("%s ������ %s", "����", "��ǿ");
        // 3. �ͷ���Դ
        ps.close();
    }
}
