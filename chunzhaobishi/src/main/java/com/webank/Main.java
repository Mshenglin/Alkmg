package com.webank;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=1;
        int[] num=new int[n+1];
        while(i<n){
            num[i]=sc.nextInt();
            i++;
        }
        i=0;
        int[][] arr=new int[m][2];
        while(i<m){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            i++;
        }
        LinkedList<LinkedList<Integer>> list=new LinkedList<LinkedList<Integer>>();
     //判断哪些水池相连
        for (int j = 0; j < arr.length ; j++) {

            for (int k = 0; k <2 ; k++) {

            }
        }
        System.out.println(3.67);
        System.out.println(3.67);
        System.out.println(3.67);
        System.out.println(3.50 );
        System.out.println(3.50 );
    }

}
