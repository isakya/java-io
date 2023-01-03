package com.izumi.myzipstream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// 需求：压缩文件夹
public class ZipStreamDemo03 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个File表示要压缩的文件夹
        File src = new File("./public/myzip");

        // 2. 创建一个File表示压缩包的位置
        File destParent = src.getParentFile(); // 获取src的目录
        File dest = new File(destParent,src.getName() + "1" + ".zip");

        // 3. 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        // 4. 获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        toZip(src, zos, src.getName());

        // 释放资源
        zos.close();
    }


    // 参数二：压缩流
    // 参数三：压缩包内部的路径
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        // 1. 进入src文件夹
        File[] files = src.listFiles();
        // 2. 遍历数组
        for(File file : files) {
            if(file.isFile()) {
                // 3. 判断-文件， 变成ZipEntry对象，放入到压缩包当中
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(entry);
                // 读取文件中的数据，写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                // 4. 判断-文件夹，递归
                toZip(file, zos, name + "/" + file.getName());
            }
        }
    }


}
