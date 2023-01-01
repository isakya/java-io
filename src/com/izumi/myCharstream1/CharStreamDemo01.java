package com.izumi.myCharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo01 {
    /*
        第一步：创建对象
        第二步：读取数据
        第三步：释放资源
     */

    public static void main(String[] args) throws IOException {
        // 1. 创建对象
        FileReader fr = new FileReader("./b.txt");
        // 2. 读取数据read()
        // 字符流的底层也是字节流：默认营业室一个字节一个字节的读取的
        // 如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节

        // read()细节：
        // 1. read() 默认也是一个字节一个字节的读取的，如果遇到中文就会一次读取多个
        // 2. 在读取之后，方法的底层还是会进行解码并转成十进制，最终把这个十进制作为返回值，这个十进制的数据也表示在字符集上的数字

        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 3. 释放资源
        fr.close();
    }
}
