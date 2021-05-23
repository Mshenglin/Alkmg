package com.datatype;

import java.util.Arrays;

/**
 * String类API使用
 * @author
 */
public class StringAPI {
    public static void main(String[] args) {
        String s="1,2,3,#,4,5,";
        Integer.parseInt("s");
        String[] split = s.split(",");
        System.out.println(Arrays.toString(split));
    }
}
