package com.izumi.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /***
         * �ֽڴ�ӡ����
         *      ���췽��
         *          public PrintStream(OutputStream/File/String)            �����ֽ������/�ļ�/�ļ�·��
         *          public PrintStream(String fileName, Charset charset)    ָ���ַ�����
         *          public PrintStream(OutputStream out, boolean autoFlush)    �����ֽ������/�ļ�/�ļ�·��
         *          public PrintStream(OutputStream out, boolean autoFlush, String encoding)    �����ֽ������/�ļ�/�ļ�·��
         *
         *      ��Ա����
         *          public void write(int b)    ���淽���������֮ǰһ������ָ�����ֽ�д��
         *          public void println(Xxx xx)    ���з�������ӡ�������ݣ��Զ�ˢ�£��Զ�����
         *          public void print(Xxx xx)    ���з�������ӡ�������ݣ�������
         *          public void printf(String format, Object... args)    ���з���������ռλ���Ĵ�ӡ��䣬������
         */

        // 1. �����ֽڴ�ӡ���Ķ���
        PrintStream ps = new PrintStream(new FileOutputStream("./d.txt"), true);
        // 2. д������
        ps.println(97);
        ps.print(true);
        ps.printf("%s ������ %s", "����", "��ǿ");
        // 3. �ͷ���Դ
        ps.close();
    }
}
