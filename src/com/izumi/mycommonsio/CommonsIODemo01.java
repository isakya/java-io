package com.izumi.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo01 {
    public static void main(String[] args) throws IOException {
        /***
         *      FileUtils�ࣺ
         *         static void copyFile(File srcFile��File destFile)               �����ļ�
         *         static void copyDirectory(File srcDir��File destDir)            �����ļ���
         *         static void copyDirectoryToDirectory(File srcDir��File destDir) �����ļ��У��ٰ�һ���ļ��У�
         *         static void deleteDirectory(File directory)                     ɾ���ļ���
         *         static void cleanDirectory(File directory)                      ����ļ���
         *         static String readFileToString(File file, Charset encoding)     ��ȡ�ļ��е����ݱ�ɳ��ַ���
         *         static void write(File file, CharSequence data, String encoding) д������
         *
         *      IOUtil�ࣺ
         *         public static int copy(InputStream input, OutputStream output)   �����ļ�
         *         public static int copyLarge(Reader input��Writer output)         ���ƴ��ļ�
         *         public static String readLines(Reader input)                     ��ȡ����
         *         public static void write(String data, OutputStream output)       д������
         */

        File src = new File("./d.txt");
        File dest = new File("./d-copy.txt");
        FileUtils.copyFile(src, dest);

    }
}
