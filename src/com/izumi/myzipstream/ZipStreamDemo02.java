package com.izumi.myzipstream;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// 需求：压缩单个文件
public class ZipStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个File表示要压缩的文件
        File src = new File("./public/csb.txt");

        // 2. 创建一个File表示压缩包的位置
        File dest = new File("./public");

        // 调用方法，压缩
        toZip(src, dest);
    }


    public static void toZip(File src, File dest) throws IOException {
        // 1. 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "csb.zip")));
        // 2. 创建ZipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("csb.txt");
        // 3. 把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        // 4. 把src文件中的数据写到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1) {
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
