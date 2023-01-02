package com.izumi.mybufferedstream1;

import java.io.*;

// 字节缓冲流拷贝文件
public class BufferedStreamDemo01 {
    /**
     * 需求：
     *      利用直接缓冲流拷贝文件
     * 直接缓冲输入流的构造方法：
     *      public BufferedInputStream(InputStream is)
     * 直接缓冲输出流的构造方法：
     *      public BufferedOutputStream(OutputStream os)
     */

    // ctrl + p 查看方法参数

    public static void main(String[] args) throws IOException {
        // 1. 创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./public/bis.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./public/bos.txt"));
        // 2. 循环读取并写到目的地
        int b;
        while((b = bis.read()) != -1) {
            bos.write(b);
        }
        // 3. 释放资源
        bos.close();
        bis.close();
    }
}
