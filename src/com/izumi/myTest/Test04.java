package com.izumi.myTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

// 需求：文件内容排序
public class Test04 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
            2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
            1-2-4-7-8-9
         */

        // 1. 读取数据
        FileReader fr = new FileReader("./public/sort.txt");
        StringBuffer sb = new StringBuffer();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        System.out.println(sb);

        // 2. 排序
        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        // 3. 结果写出
        FileWriter fw = new FileWriter("./public/sortRes.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String res = s.substring(1, s.length() - 1);
        System.out.println(res);

        fw.write(res);

        fw.close();
    }
}


