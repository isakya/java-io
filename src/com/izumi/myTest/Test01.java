package com.izumi.myTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 需求：拷贝文件夹、需要考虑到子文件
public class Test01 {
    public static void main(String[] args) throws IOException {
        // 1. 创建对象便是数据源
        File origin = new File("./public/origin");
        // 2. 创建对象表示目的地
        File copy = new File("./public/copy");

        // 3. 调用方法开始拷贝
        copydir(origin, copy);
    }


    /*
        拷贝文件夹
        参数：1.数据源 2.目的地
     */
    private static void copydir(File origin, File copy) throws IOException {
        // 如果目标文件夹不存在，则创建
        copy.mkdirs();

        // 递归
        // 1. 进入数据源
        File[] files = origin.listFiles();
        // 2. 遍历数组
        for(File file : files) {
            if(file.isFile()) {
                // 3. 判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                // 父级路径：copy，子级路径：file.getName()
                FileOutputStream fos = new FileOutputStream(new File(copy, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes))!= -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }else {
                // 4. 判断文件夹，递归
                copydir(file, new File(copy, file.getName()));
            }
        }
    }
}


