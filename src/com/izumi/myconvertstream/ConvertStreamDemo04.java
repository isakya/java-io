package com.izumi.myconvertstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// ��������ֱ������ȡ�ļ��е����ݣ�ÿ�ζ�һ���У����Ҳ��ܳ�������
public class ConvertStreamDemo04 {

    public static void main(String[] args) throws IOException {
        // 1. �ֽ����ڶ�ȡ���ĵ�ʱ���ǻ��������ģ������ַ������Խ��
        // 2. �ֽ���������û�ж�һ���еķ����ģ�ֻ���ַ����������ܸ㶨

        FileInputStream fis = new FileInputStream("./public/csb.txt"); // ֱ�Ӷ�ȡ������
        InputStreamReader isr = new InputStreamReader(fis); // ����˵�һ�����⣬���ǵڶ�������û�н��
        BufferedReader br = new BufferedReader(isr); // ����˵ڶ�������
        String s = br.readLine();
        System.out.println(s);
        br.close();


    }
}
