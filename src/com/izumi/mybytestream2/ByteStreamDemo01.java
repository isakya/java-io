package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

// 需求：读取文件中的数据。（暂时不写中文）
public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
            字节输入流FileInputStream：
                1. 创建字节输入流对象
                    细节1：如果文件不存在，就直接报错
                    Java为什么会这么设计呢？
                    输出流：不存在，创建
                        把数据写到文件当中
                    输入流：不存在，而是报错呢？
                        因为数据在文件当中，就算创建出文件也是个空文件，所以没有意义

                2. 写数据
                    细节1：一次读一个直接，读出来的数据是ASCII上对应的数据
                    细节2：读取到末尾了，read方法返回-1

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
