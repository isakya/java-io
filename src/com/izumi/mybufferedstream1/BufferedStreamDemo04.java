package com.izumi.mybufferedstream1;

import java.io.*;

// 字符缓冲输出流：
public class BufferedStreamDemo04 {
    /**
     * 字符缓冲输入流：
     * 构造方法：
     *      public BufferedWriter(Reader r)
     * 特有方法：
     *      public String newLine() // 跨平台的换行
     */


    public static void main(String[] args) throws IOException {
        // 1. 创建字符缓冲输入流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/bos.txt", true));
        // 2. 写出数据
        bw.write("你嘴角上扬的样子真好看！");
        bw.newLine();
        bw.write("红红火火恍恍惚惚或或或");
        // 3. 释放资源
        bw.close();
    }
}
