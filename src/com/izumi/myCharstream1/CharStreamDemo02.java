package com.izumi.myCharstream1;

import java.io.FileReader;
import java.io.IOException;

// read(char[] buffer) ��ȡ������ݣ�����ĩβ����-1
public class CharStreamDemo02 {
    /*
        ��һ������������
        �ڶ�������ȡ����
        ���������ͷ���Դ
     */

    public static void main(String[] args) throws IOException {
        // 1. ��������
        FileReader fr = new FileReader("./b.txt");

        // 2. ��ȡ����
        char[] chars = new char[10];
        int len;
        // read(chars): ��ȡ���ݣ����룬ǿת�������ϲ��ˣ���ǿת֮����ַ��ŵ����鵱��
        // �ղε�read + ǿת���͵�ת��
        while((len = fr.read(chars)) != -1) {
            // �������е����ݱ���ַ����ٽ��д�ӡ
            System.out.print(new String(chars, 0, len));
        }

        // 3. �ͷ���Դ
        fr.close();
    }
}
