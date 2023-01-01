package com.izumi.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
            练习；
                文件拷贝
                把：./public/笠原弘子 - 遠い空.mp3 拷贝到当前模块下

         */

        // 获取当前时间
        long start = System.currentTimeMillis();

        // 1. 创建对象
        FileInputStream fis = new FileInputStream("./public/笠原弘子 - 遠い空.mp3");
        FileOutputStream fos = new FileOutputStream("./src/com/izumi/mybytestream2/笠原弘子 - 遠い空.mp3");

        // 2. 拷贝
        int len;
        byte[] bytes = new byte[1024 * 1024 *5];
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        // 3. 释放资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        // 当前时间 - 结束时间 = 拷贝时长
        System.out.println(end - start + "ms");
    }
}
