package com.izumi.myTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// �����ļ���������
public class Test03 {
    public static void main(String[] args) throws IOException {
        /*
            �ı��ļ��������µ����ݣ�
            2-1-9-4-7-8
            ���ļ��е����ݽ������򣬱�����µ����ݣ�
            1-2-4-7-8-9
         */

        // 1. ��ȡ����
        FileReader fr = new FileReader("./public/sort.txt");
        StringBuffer sb = new StringBuffer();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        System.out.println(sb);

        // 2. ����
        String str = sb.toString();
        String[] arrStr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
           // ���ַ���ת��Ϊ����
           int i = Integer.parseInt(s);
           list.add(i);
        }

        // ����
        Collections.sort(list);
        System.out.println(list);


        // 3. ���д��
        FileWriter fw = new FileWriter("./public/sortRes.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                fw.write(list.get(i) + ""); // д������ַ���
            } else {
                fw.write(list.get(i) + "-"); // ���Ϻ��
            }
        }
        fw.close();
    }
}


