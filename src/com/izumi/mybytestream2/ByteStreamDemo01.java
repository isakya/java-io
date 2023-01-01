package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

// 需求：读取文件中的数据。（暂时不写中文）
public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
            字节输入流FileInputStream：
                1. 创建字节输入流对象
                2. 写数据
                3. 释放资源
         */

        // 1. 创建对象
        FileInputStream fis = new FileInputStream("./a.txt");

        // 2. 读取数据
        int b1;
        while((b1 = fis.read()) != -1) {
            System.out.println((char)b1);
        }

        // 3. 关闭资源
        fis.close();
    }
}
