package com.izumi.myCharstream1;

import java.io.FileWriter;
import java.io.IOException;

// �ַ������
public class CharStreamDemo03 {
    /*
        ��һ������������
        �ڶ�����д������
        void write(int c)                           д��һ���ַ�
        void write(String str)                      д��һ���ַ���
        void write(String str, int off, int len)    д��һ���ַ�����һ����
        void write(char[] cbuf)                     д��һ���ַ�����
        void write(char[] cbuf, int off, int len)   д���ַ������һ����
        ���������ͷ���Դ
     */

    public static void main(String[] args) throws IOException {
        // 1. ��������
        FileWriter fw = new FileWriter("./c.txt", true);

        // 2. д������

        // fw.write(25105); // �����ַ����ı��뷽ʽ���б��룬�ѱ���֮�������д���ļ���ȥ

        fw.write("��ð���������");

        char[] chars = {'a', 'b', '��'};
        fw.write(chars);

        // 3. �ͷ���Դ
        fw.close();
    }
}
