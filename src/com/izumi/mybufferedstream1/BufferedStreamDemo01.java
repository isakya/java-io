package com.izumi.mybufferedstream1;

import java.io.*;

// �ֽڻ����������ļ�
public class BufferedStreamDemo01 {
    /**
     * ����
     *      ����ֱ�ӻ����������ļ�
     * ֱ�ӻ����������Ĺ��췽����
     *      public BufferedInputStream(InputStream is)
     * ֱ�ӻ���������Ĺ��췽����
     *      public BufferedOutputStream(OutputStream os)
     */

    // ctrl + p �鿴��������

    public static void main(String[] args) throws IOException {
        // 1. �����������Ķ���
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./public/bis.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./public/bos.txt"));
        // 2. ѭ����ȡ��д��Ŀ�ĵ�
        int b;
        while((b = bis.read()) != -1) {
            bos.write(b);
        }
        // 3. �ͷ���Դ
        bos.close();
        bis.close();
    }
}
