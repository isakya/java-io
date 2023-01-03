package com.izumi.myzipstream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// ����ѹ���ļ���
public class ZipStreamDemo03 {
    public static void main(String[] args) throws IOException {
        // 1. ����һ��File��ʾҪѹ�����ļ���
        File src = new File("./public/myzip");

        // 2. ����һ��File��ʾѹ������λ��
        File destParent = src.getParentFile(); // ��ȡsrc��Ŀ¼
        File dest = new File(destParent,src.getName() + "1" + ".zip");

        // 3. ����ѹ��������ѹ����
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        // 4. ��ȡsrc�����ÿһ���ļ������ZipEntry���󣬷��뵽ѹ��������
        toZip(src, zos, src.getName());

        // �ͷ���Դ
        zos.close();
    }


    // ��������ѹ����
    // ��������ѹ�����ڲ���·��
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        // 1. ����src�ļ���
        File[] files = src.listFiles();
        // 2. ��������
        for(File file : files) {
            if(file.isFile()) {
                // 3. �ж�-�ļ��� ���ZipEntry���󣬷��뵽ѹ��������
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(entry);
                // ��ȡ�ļ��е����ݣ�д��ѹ����
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                // 4. �ж�-�ļ��У��ݹ�
                toZip(file, zos, name + "/" + file.getName());
            }
        }
    }


}
