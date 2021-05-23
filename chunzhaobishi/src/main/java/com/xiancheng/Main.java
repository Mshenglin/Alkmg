package com.xiancheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String buildingHouse(int n) {
        if(n==2){
            return "GRR";
        }
        String s=buildingHouse(n-1);
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i%2==1){
                if(s.charAt(i)=='G'){
                    stringBuffer.append("G");
                }
                else {
                    stringBuffer.append("R");
                }

            }
            else{
                if(s.charAt(i)=='G'){
                    stringBuffer.append("GGR");
                }
                else {
                    stringBuffer.append("GRR");
                }
            }
        }
        return stringBuffer.toString();
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
        String _n = null;
        int n=0;
        try {
            _n = in.nextLine();
            n=Integer.valueOf(_n);
        } catch (Exception e) {
            _n = null;
        }finally {
            if (_n==null){
                System.out.println("O");
            }
        }

        if (n==0||n==1){
            System.out.println( n==0?"":"R");
 return;
        }
        res = buildingHouse(n);
        System.out.println(res);
    }
}
