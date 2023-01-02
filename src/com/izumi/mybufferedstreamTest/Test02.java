package com.izumi.mybufferedstreamTest;

import java.io.*;
import java.util.*;

// �޸��ı�˳��(�ڶ���д��)
public class Test02 {
    public static void main(String[] args) throws IOException {
        /***
         * ����
         *      �ѡ���ʦ��������˳����лָ���һ�����ļ���
         */

        // 1. ��ȡ����
        BufferedReader br = new BufferedReader(new FileReader("./public/csb.txt"));
        String line;
        // TreeMap���Զ�����
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            // 0: ��� 1������
            tm.put(Integer.parseInt(arr[0]), line);
        }
        br.close();
        System.out.println(tm);

        // 3. д������
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/csb-res.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
