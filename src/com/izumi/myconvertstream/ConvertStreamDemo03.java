package com.izumi.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

// �������ļ��е�UTF-8�ļ���ת��GBK
public class ConvertStreamDemo03 {

    public static void main(String[] args) throws IOException {
        /*

            // 1. JDK11��ǰ�ķ���
            InputStreamReader isr = new InputStreamReader(new FileInputStream("./public/utf8file.txt"), "UTF-8");
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./public/utf8res.txt"), "GBK");

            int b;
            while ((b = isr.read()) != -1) {
                osw.write(b);
            }

            osw.close();
            isr.close();

         */

        /*

            // 2. �������
            FileReader fr = new FileReader("./public/utf8file.txt", Charset.forName("UTF-8"));
            FileWriter fw = new FileWriter("./public/utf8res.txt", Charset.forName("GBK"));
            int b;
            while ((b = fr.read()) != -1) {
                fw.write(b);
            }
            fw.close();
            fr.close();

         */

    }
}
