package com.izumi.myTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// 需求：文件内容排序
public class Test03 {
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
        String str = sb.toString();
        String[] arrStr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
           // 把字符串转换为数字
           int i = Integer.parseInt(s);
           list.add(i);
        }

        // 排序
        Collections.sort(list);
        System.out.println(list);


        // 3. 结果写出
        FileWriter fw = new FileWriter("./public/sortRes.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                fw.write(list.get(i) + ""); // 写入的是字符串
            } else {
                fw.write(list.get(i) + "-"); // 加上横杆
            }
        }
        fw.close();
    }
}


