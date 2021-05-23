package com.honor;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        Arrays.sort(new int[]);
        //按空格分割
        String[] strings=s.split("\\s+");
        //用于拼接新的字符串
        StringBuilder stringBuilder=new StringBuilder();
        //遍历字符数组
        for (String str:
             strings) {
            int len = str.length();
            while (len > 8) {
                stringBuilder.append(str.substring(0, 8)).append(" ");
                int p=len;
                len = str.length() - 8;
                str = str.substring(8, p);
                System.out.println(len);
            }
            if (len <= 8) {
                if (len == 8) {
                    stringBuilder.append(str).append(" ");
                } else {
                    stringBuilder.append(str);
                    for (int i = 0; i < 8 - len; i++) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(" ");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
