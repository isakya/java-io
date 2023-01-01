package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    /*
        练习：
            拷贝文件
            把./public/movie.mp4拷贝到当前模块下。
        注意：
            选择一个比较小的文件
     */

    public static void main(String[] args) throws IOException {
        // 1. 创建对象
        FileInputStream fis = new FileInputStream("./public/movie.mp4");
        FileOutputStream fos = new FileOutputStream("./src/com/izumi/mybytestream2/copy.mp4");

        // 2. 拷贝
        // 核心思想：边读边写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 3. 释放资源
        // 规则：先开的流，最后关闭
        fos.close();
        fis.close();
    }
}
