package com.izumi.myCharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo01 {
    /*
        ��һ������������
        �ڶ�������ȡ����
        ���������ͷ���Դ
     */

    public static void main(String[] args) throws IOException {
        // 1. ��������
        FileReader fr = new FileReader("./b.txt");
        // 2. ��ȡ����read()
        // �ַ����ĵײ�Ҳ���ֽ�����Ĭ��Ӫҵ��һ���ֽ�һ���ֽڵĶ�ȡ��
        // ����������ľͻ�һ�ζ�ȡ�����GBKһ�ζ������ֽڣ�UTF-8һ�ζ������ֽ�

        // read()ϸ�ڣ�
        // 1. read() Ĭ��Ҳ��һ���ֽ�һ���ֽڵĶ�ȡ�ģ�����������ľͻ�һ�ζ�ȡ���
        // 2. �ڶ�ȡ֮�󣬷����ĵײ㻹�ǻ���н��벢ת��ʮ���ƣ����հ����ʮ������Ϊ����ֵ�����ʮ���Ƶ�����Ҳ��ʾ���ַ����ϵ�����

        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 3. �ͷ���Դ
        fr.close();
    }
}
