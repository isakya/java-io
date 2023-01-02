package com.izumi.myTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 需求：文件加密
public class Test02 {
    public static void main(String[] args) throws IOException {

        // ^:异或
        // 一个数异或另外一个数2次还是得到这个数

        // 1. 创建对象关联原始文件
        FileInputStream fis = new FileInputStream("./public/izumi.jpg");
        // 2. 创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("./public/izumi-eny.jpg");
        // 3. 加密处理
        int b;
        while((b = fis.read())!=-1) {
            fos.write(b ^ 2);
        }
        // 4. 释放资源
        fos.close();
        fis.close();

        // 解密直接把关联文件调换一下就可以了
    }
}


