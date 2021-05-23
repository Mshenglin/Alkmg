package com.ali;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int L= (int) Math.pow(2, n);
        //构建数组
        int[][] arr=new int[L][L];
        //分成四个部分所以要构建边界
        int mid=L/2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((i==L-1)||(j==L-1)||(i==mid-1&&j>mid-1)||(j==mid-1&&i>mid-1)||(i+j==L-1)||(i+j==(mid+L-1))){
                    arr[i][j]=1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
            }
    }

}
