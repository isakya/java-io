package com.izumi.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

//����д��һ�����ֵ������ļ��С�����ʱ��д���ģ�
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            �ֽ��������ϸ�ڣ�
                1. �����ֽ����������
                    ϸ��1���������ַ�����ʾ��·��������File�����ǿ��Ե�
                    ϸ��2������ļ������ڻᴴ��һ���µ��ļ�������Ҫ��֤����·���Ǵ��ڵġ�
                    ϸ��3������ļ��Ѿ����ڣ��������ļ�

                2. д����
                    ϸ�ڣ�write�����Ĳ���������������ʵ����д�������ļ��е���������ASCII�϶�Ӧ���ַ�
                    97 --> a
                    100 --> d

                3. �ͷ���Դ
                    ÿ��ʹ������֮��Ҫ�ͷ���Դ����Ȼ��һֱռ������ļ�
         */

        // 1. ��������
        FileOutputStream fos = new FileOutputStream("./b.txt");
        // 2. д������
        fos.write(97);
        // 3. �ͷ���Դ
        fos.close();
    }
}
