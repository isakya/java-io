package com.izumi.mybufferedstreamTest;

import java.io.*;

// �����û�ʹ�����������3�κ������
public class Test03 {
    public static void main(String[] args) throws IOException {

        // 1. ���ļ��е����ֶ�ȡ���ڴ���
        BufferedReader br = new BufferedReader(new FileReader("./public/count.txt"));
        String line = br.readLine();
        br.close();

        int count = Integer.parseInt(line);
        // ��ʾ��ǰ�����������һ��
        count++;


        // 2. �ж�
        // <=3 �������� ����������
        if(count <= 3) {
            System.out.println("��ӭʹ�ñ��������" + count + "��ʹ����ѣ�");
        } else {
            System.out.println("�����ֻ�����ʹ��3�Σ���ӭ��ע���������ʹ��");
        }

        // 3. �ѵ�ǰ����֮���countд�����ļ�����
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
