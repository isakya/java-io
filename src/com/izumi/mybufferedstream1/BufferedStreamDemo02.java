package com.izumi.mybufferedstream1;

import java.io.*;

// �ֽڻ����������ļ���һ�ζ�д����ֽ�
public class BufferedStreamDemo02 {
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

        // 2. ������һ�ζ�д����ֽڣ�
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        // 3. �ͷ���Դ
        bos.close();
        bis.close();
    }
}
