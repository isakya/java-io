package com.izumi.myCharstream1;

import java.io.FileWriter;
import java.io.IOException;

// 字符输出流
public class CharStreamDemo03 {
    /*
        第一步：创建对象
        第二步：写出数据
        void write(int c)                           写出一个字符
        void write(String str)                      写出一个字符串
        void write(String str, int off, int len)    写出一个字符串的一部分
        void write(char[] cbuf)                     写出一个字符数组
        void write(char[] cbuf, int off, int len)   写出字符数组的一部分
        第三步：释放资源
     */

    public static void main(String[] args) throws IOException {
        // 1. 创建对象
        FileWriter fw = new FileWriter("./c.txt", true);

        // 2. 写入数据

        // fw.write(25105); // 根据字符集的编码方式进行编码，把编码之后的数据写到文件中去

        fw.write("你好啊狗蛋？？");

        char[] chars = {'a', 'b', '我'};
        fw.write(chars);

        // 3. 释放资源
        fw.close();
    }
}
