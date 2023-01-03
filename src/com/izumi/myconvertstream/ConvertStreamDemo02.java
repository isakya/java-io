package com.izumi.myconvertstream;

import java.io.*;

// 利用转换流按照指定字符编码写出
public class ConvertStreamDemo02 {

    public static void main(String[] args) throws IOException {
        /*

            // 1. 创建转换流对象
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./public/utf8-out.txt"), "UTF8");

            // 2. 写出数据
            osw.write("你好你好");

            // 3. 释放资源
            osw.close();

         */

        /*

            // 替代方案
            FileWriter fw = new FileWriter("./public/utf8-out.txt", "UTF-8");
            fw.write("你好你好");
            fw.close();

         */
    }
}
