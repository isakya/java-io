package com.izumi.myTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

// �����ļ���������
public class Test04 {
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
        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        // 3. ���д��
        FileWriter fw = new FileWriter("./public/sortRes.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String res = s.substring(1, s.length() - 1);
        System.out.println(res);

        fw.write(res);

        fw.close();
    }
}


