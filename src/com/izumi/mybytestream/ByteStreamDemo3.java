package com.izumi.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

// ��д�ļ�����
public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
               ����д��
                    �ٴ�д��һ�����з��Ϳ��Ի���
                    windows��\r\n
                    Linux: \n
                    Mac: \r
               ϸ�ڣ�
                    ��windows����ϵͳ���У�java�Իس����н������Ż���
                    ��Ȼ��������\r\n����������д����һ��\r����\r
                    javaҲ����ʵ�ֻ��У���Ϊjava�ڵײ�Ჹȫ��
               ���飺
                    ��Ҫʡ�ԣ�����дȫ�ˡ�

               ��д��
                    �����Ҫ��д������д���ؼ���
                    ����λ�ã���������ĵڶ�������
                    Ĭ��false����ʾ�ر���д����ʱ�������������ļ�
                    �ֶ�����true����ʾ����д����ʱ�������󲻻�����ļ�
         */

        // 1. �������󣬴���д
        FileOutputStream fos = new FileOutputStream("./a.txt", true);
        // 2. д������
        String str = "izumi";
        // ���ַ��Զ�ת��Ϊ�ֽ�����
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        // �ٴ�д��һ�����з��Ϳ��Ի���
        String wrap = "\r\n";
        byte[] wraps = wrap.getBytes();
        fos.write(wraps);

        String str2 = "666";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);


        // 3. �ͷ���Դ
        fos.close();
    }
}
