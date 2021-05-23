package com.tencent;

import java.math.BigInteger;
import java.util.*;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger m=sc.nextBigInteger();
        String str=m.toString();
        // 新建一个数组用来保存num每一位的数字
        LinkedList<Integer> list= new LinkedList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            // 遍历str将每一位数字添加如intArray
            Character ch = str.charAt(i);
            list.add(Integer.parseInt(ch.toString())) ;
        }
      //将所有的数字都转化为了数组
        boolean flag=true;
        while(flag){
            int p=0;
            for(int i=0;i<list.size()-1;i++){
                //如果两数相加等于十
                if((list.get(i)+list.get(i+1) == 10)){
                    list.remove(i);
                    list.remove(i);
                    break;
                }
                if(i==list.size()-2||i==list.size()){
                    flag=false;
                }
            }
            if(list.size()==0){
                flag=false;
            }
        }
        System.out.println(list.size());
    }
    }