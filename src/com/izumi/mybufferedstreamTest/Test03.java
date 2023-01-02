package com.izumi.mybufferedstreamTest;

import java.io.*;

// 限制用户使用软件次数：3次后不再免费
public class Test03 {
    public static void main(String[] args) throws IOException {

        // 1. 把文件中的数字读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("./public/count.txt"));
        String line = br.readLine();
        br.close();

        int count = Integer.parseInt(line);
        // 表示当前软件又运行了一次
        count++;


        // 2. 判断
        // <=3 正常运行 否则不能运行
        if(count <= 3) {
            System.out.println("欢迎使用本软件，第" + count + "次使用免费！");
        } else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会议后继续使用");
        }

        // 3. 把当前自增之后的count写出到文件当中
        BufferedWriter bw = new BufferedWriter(new FileWriter("./public/count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
