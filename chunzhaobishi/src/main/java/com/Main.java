package com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] num=new int[n];
        while(i<n){
            num[i]=sc.nextInt();
            i++;
        }
        //使用单调栈解决
        //用来存放从左看最高的山峰
        int[]  arrLeft=new int[n];
        //存放从右看最高的山峰
        int[] arrRight=new int[n];

        //实现单调栈
        Stack<Integer> stack=new Stack<Integer>();
        for (int j = 0; j < n ; j++) {
            while(!stack.isEmpty()&&num[j]>=stack.peek()){
                stack.pop();
            }
            arrLeft[j]=stack.isEmpty()?-1:stack.peek();
            //将当前元素压入
            stack.push(num[j]);
        }
        stack.clear();
        for (int j = n-1; j >=0 ; j--) {
            while(!stack.isEmpty()&&num[j]>=stack.peek()){
                stack.pop();
            }
            arrRight[j]=stack.isEmpty()?-1:stack.peek();
            //将当前元素压入
            stack.push(num[j]);
        }
        int count=0;
        for (int j = 0; j < arrLeft.length; j++) {
            if((arrLeft[j]==-1)&&(arrRight[j]==-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
