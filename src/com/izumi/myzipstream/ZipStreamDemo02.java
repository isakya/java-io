package com.izumi.myzipstream;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// ����ѹ�������ļ�
public class ZipStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. ����һ��File��ʾҪѹ�����ļ�
        File src = new File("./public/csb.txt");

        // 2. ����һ��File��ʾѹ������λ��
        File dest = new File("./public");

        // ���÷�����ѹ��
        toZip(src, dest);
    }


    public static void toZip(File src, File dest) throws IOException {
        // 1. ����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "csb.zip")));
        // 2. ����ZipEntry���󣬱�ʾѹ���������ÿһ���ļ����ļ���
        ZipEntry entry = new ZipEntry("csb.txt");
        // 3. ��ZipEntry����ŵ�ѹ��������
        zos.putNextEntry(entry);
        // 4. ��src�ļ��е�����д��ѹ��������
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1) {
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
