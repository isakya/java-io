package com.izumi.mybufferedstreamTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 修改文本顺序(第一种写法)
public class Test01 {
    public static void main(String[] args) throws IOException {
        /***
         * 需求：
         *      把《出师表》的文章顺序进行恢复到一个新文件中
         */

        // 1. 读取数据
        BufferedReader br = new BufferedReader(new FileReader("./public/csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        // 2. 排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 获取o1 和 o2的序号
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);

                return i1 - i2;
            }
        });

        // 3. 写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/csb-res.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
