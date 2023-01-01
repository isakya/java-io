package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
            public int read(byte[] buffer) 一次读一个字节数组数据
         */
        
        // 1. 创建对象
        FileInputStream fis = new FileInputStream("./a.txt");
        // 2. 读取数据
        byte[] bytes = new byte[2];

        // 一次读取多个字节数据，具体读多少，跟数组的长度有关
        // 返回值：本次读取到了多少个字节数据
        int len = fis.read(bytes);
        System.out.println(len); // 2
        String str = new String(bytes, 0, len);
        System.out.println(str);

        int len2 = fis.read(bytes);
        System.out.println(len2); // 1
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);

        // 3. 释放资源
        fis.close();
    }
}
