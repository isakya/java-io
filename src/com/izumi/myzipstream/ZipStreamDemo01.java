package com.izumi.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // 1. ����һ��File��ʾҪ��ѹ��ѹ����
        File src = new File("./public/myzip.zip");

        // 2. ����һ��File��ʾ��ѹ����Ŀ�ĵ�
        File dest = new File("./public/myzip");

        // ���÷���
        unzip(src, dest);
    }

    // ����һ������������ѹ
    public static void unzip(File src, File dest) throws IOException {
        // ��ѹ�ı��ʣ���ѹ���������ÿһ���ļ������ļ��ж�ȡ���������ղ㼶������Ŀ�ĵص���
        // ����һ����ѹ��������ȡѹ�����е�����
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));


        // Ҫ�Ȼ�ȡ��ѹ���������ÿһ��zipentry����
        // ��ʾ��ǰ��ѹ�����л�ȡ�����ļ����ļ���
        ZipEntry entry;

        while((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if(entry.isDirectory()) {
                // �ļ��У���Ҫ��Ŀ�ĵ�dest������һ��ͬ�����ļ���
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                // �ļ�����Ҫ��ȡ��ѹ�����е��ļ�����������ŵ�Ŀ�ĵ��ļ����У���װ�㼶Ŀ¼���д�ţ�
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while((b = zip.read()) != -1) {
                    // д��Ŀ�ĵ�
                    fos.write(b);
                }
                fos.close();
                // ��ʾ��ѹ�����е�һ���ļ����������
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
