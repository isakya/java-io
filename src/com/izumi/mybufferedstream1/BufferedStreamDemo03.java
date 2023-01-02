package com.izumi.mybufferedstream1;

import java.io.*;

// 字符缓冲输入流：
public class BufferedStreamDemo03 {
    /**
     * 字符缓冲输入流：
     * 构造方法：
     *      public BufferedReader(Reader r)
     * 特有方法：
     *      public String readLine() // 读一整行
     */


    public static void main(String[] args) throws IOException {
        // 1. 创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("./public/bis.txt"));
        // 2. 读取数据
        // 细节：
        // readLine方法在读取的时候，一次读一整行，遇到回车换行结束，但是他不会把回车换行读到内存当中
        String line1 = br.readLine();
        System.out.println(line1);

        String line2 = br.readLine();
        System.out.println(line2);

        // 循环读取，注意读到最后返回的是null
        String line3;
        while ((line3 = br.readLine()) != null) {
            System.out.println(line3);
        }

        // 3. 释放资源
        br.close();
    }
}
