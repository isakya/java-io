package com.izumi.mycharset;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CharSetDemo01 {
    public static void main(String[] args) {
        /*
            Java中编码的方法
                public byte[] getBytes()                    使用默认方式进行编码
                public byte[] getBytes(String charsetNames) 使用指定方式进行编码

            Java中解码的方法
                public byte[] getBytes()                    使用默认方式进行编码
                public byte[] getBytes(String charsetNames) 使用指定方式进行编码
         */

        // 1. 编码
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1)); // 6个字节 [97, 105, -60, -29, -45, -76]

        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(bytes2)); // 8个字节 [97, 105, -28, -67, -96, -27, -109, -97]

        // 2. 解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes1, StandardCharsets.UTF_8);
        System.out.println(str3);
    }
}
