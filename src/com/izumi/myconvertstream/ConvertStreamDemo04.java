package com.izumi.myconvertstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 需求：利用直接流读取文件中的数据，每次读一整行，而且不能出现乱码
public class ConvertStreamDemo04 {

    public static void main(String[] args) throws IOException {
        // 1. 字节流在读取中文的时候，是会出现乱码的，但是字符流可以解决
        // 2. 字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定

        FileInputStream fis = new FileInputStream("./public/csb.txt"); // 直接读取会乱码
        InputStreamReader isr = new InputStreamReader(fis); // 解决了第一个问题，但是第二个问题没有解决
        BufferedReader br = new BufferedReader(isr); // 解决了第二个问题
        String s = br.readLine();
        System.out.println(s);
        br.close();


    }
}
