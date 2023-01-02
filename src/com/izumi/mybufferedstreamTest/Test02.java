package com.izumi.mybufferedstreamTest;

import java.io.*;
import java.util.*;

// 修改文本顺序(第二种写法)
public class Test02 {
    public static void main(String[] args) throws IOException {
        /***
         * 需求：
         *      把《出师表》的文章顺序进行恢复到一个新文件中
         */

        // 1. 读取数据
        BufferedReader br = new BufferedReader(new FileReader("./public/csb.txt"));
        String line;
        // TreeMap会自动排序
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            // 0: 序号 1：内容
            tm.put(Integer.parseInt(arr[0]), line);
        }
        br.close();
        System.out.println(tm);

        // 3. 写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/csb-res.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
