package com.izumi.myCharstream1;

import java.io.FileReader;
import java.io.IOException;

// read(char[] buffer) 读取多个数据，督导末尾返回-1
public class CharStreamDemo02 {
    /*
        第一步：创建对象
        第二步：读取数据
        第三步：释放资源
     */

    public static void main(String[] args) throws IOException {
        // 1. 创建对象
        FileReader fr = new FileReader("./b.txt");

        // 2. 读取数据
        char[] chars = new char[10];
        int len;
        // read(chars): 读取数据，解码，强转，三步合并了，把强转之后的字符放到数组当中
        // 空参的read + 强转类型的转换
        while((len = fr.read(chars)) != -1) {
            // 把数组中的数据变成字符串再进行打印
            System.out.print(new String(chars, 0, len));
        }

        // 3. 释放资源
        fr.close();
    }
}
