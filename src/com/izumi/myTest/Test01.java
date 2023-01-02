package com.izumi.myTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// ���󣺿����ļ��С���Ҫ���ǵ����ļ�
public class Test01 {
    public static void main(String[] args) throws IOException {
        // 1. ���������������Դ
        File origin = new File("./public/origin");
        // 2. ���������ʾĿ�ĵ�
        File copy = new File("./public/copy");

        // 3. ���÷�����ʼ����
        copydir(origin, copy);
    }


    /*
        �����ļ���
        ������1.����Դ 2.Ŀ�ĵ�
     */
    private static void copydir(File origin, File copy) throws IOException {
        // ���Ŀ���ļ��в����ڣ��򴴽�
        copy.mkdirs();

        // �ݹ�
        // 1. ��������Դ
        File[] files = origin.listFiles();
        // 2. ��������
        for(File file : files) {
            if(file.isFile()) {
                // 3. �ж��ļ�������
                FileInputStream fis = new FileInputStream(file);
                // ����·����copy���Ӽ�·����file.getName()
                FileOutputStream fos = new FileOutputStream(new File(copy, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes))!= -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }else {
                // 4. �ж��ļ��У��ݹ�
                copydir(file, new File(copy, file.getName()));
            }
        }
    }
}


