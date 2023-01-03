package com.izumi.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

// 利用转换流按照指定字符编码读取
public class ConvertStreamDemo01 {

    public static void main(String[] args) throws IOException {
        /*
            // 1. 创建对象并指定字符编码(了解)
            // JDK11：这种方式被淘汰了
            InputStreamReader isr = new InputStreamReader(new FileInputStream("./public/utf8file.txt"), "UTF-8");

            // 2. 读取数据
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char)ch);
            }

            // 3. 释放资源
            isr.close();
        */



        /*

            // JDK8不支持，所以报错
            FileReader fr = new FileReader("./public/utf8file.txt", Charset.forName("GBK"));
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();

         */
    }
}
