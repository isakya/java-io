package com.izumi.mybufferedstreamTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// �޸��ı�˳��(��һ��д��)
public class Test01 {
    public static void main(String[] args) throws IOException {
        /***
         * ����
         *      �ѡ���ʦ��������˳����лָ���һ�����ļ���
         */

        // 1. ��ȡ����
        BufferedReader br = new BufferedReader(new FileReader("./public/csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        // 2. ����
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // ��ȡo1 �� o2�����
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);

                return i1 - i2;
            }
        });

        // 3. д��
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/csb-res.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
