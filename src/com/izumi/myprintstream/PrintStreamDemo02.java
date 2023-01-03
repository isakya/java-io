package com.izumi.myprintstream;

import java.io.*;

public class PrintStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /***
         * 字符打印流：
         *      构造方法
         *          public PrintWriter(Writer/File/String)            关联字节输出流/文件/文件路径
         *          public PrintWriter(String fileName, Charset charset)    指定字符编码
         *          public PrintWriter(Writer, boolean autoFlush)    自动刷新
         *          public PrintWriter(Writer out, boolean autoFlush, String encoding)    指定字符编码且带有自动刷新功能
         *
         *      成员方法
         *          public void write(int b)    常规方法：规则跟之前一样，将指定的字节写出
         *          public void println(Xxx xx)    特有方法：打印任意数据，自动刷新，自动换行
         *          public void print(Xxx xx)    特有方法：打印任意数据，不换行
         *          public void printf(String format, Object... args)    特有方法：带有占位符的打印语句，不换行
         */

        // 1. 创建字节打印流的对象
        PrintWriter ps = new PrintWriter(new FileWriter("./d.txt"), true);
        // 2. 写出数据
        ps.println("红红火火恍恍惚惚或或或或或，或或或或或或或或，或或或或");
        ps.print("你好");
        ps.printf("%s 爱上了 %s", "阿珍", "阿强");
        // 3. 释放资源
        ps.close();
    }
}
