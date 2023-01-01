package com.izumi.mycharset;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CharSetDemo01 {
    public static void main(String[] args) {
        /*
            Java�б���ķ���
                public byte[] getBytes()                    ʹ��Ĭ�Ϸ�ʽ���б���
                public byte[] getBytes(String charsetNames) ʹ��ָ����ʽ���б���

            Java�н���ķ���
                public byte[] getBytes()                    ʹ��Ĭ�Ϸ�ʽ���б���
                public byte[] getBytes(String charsetNames) ʹ��ָ����ʽ���б���
         */

        // 1. ����
        String str = "ai��Ӵ";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1)); // 6���ֽ� [97, 105, -60, -29, -45, -76]

        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(bytes2)); // 8���ֽ� [97, 105, -28, -67, -96, -27, -109, -97]

        // 2. ����
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes1, StandardCharsets.UTF_8);
        System.out.println(str3);
    }
}
