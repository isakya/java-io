package com.izumi.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

//需求：写出一段文字到本地文件中。（暂时不写中文）
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("./a.txt");
        // 2. 写出数据
        fos.write(97);
        // 3. 释放资源
        fos.close();
    }
}
