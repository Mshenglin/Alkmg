package com.wangyi;

import java.util.HashMap;

/**
 * @author mashenglin
 */
public class Soltion {
    HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    int sum=10;
    public int billsChange (int[] bills) {
        //特殊值判断
        if(bills.length==0){
            return 0;
        }
        int count=0;
        map.put(5,2);
        for(int i=0;i<bills.length;i++) {
                boolean flag=sell(bills[i]);
                if (flag){
                    count++;
                }
                else {
                    break;
                }
        }
        return  count;
    }
    public boolean sell(int money){
        if(money==5){
            sum+=5;
            map.put(5, map.getOrDefault(5, 0)+1);
            return true;
        }
        else if(money==10){
            if(map.get(5)==0){
                return false;
            }
            else{
                sum+=5;
                map.put(5, map.get(5)-1);
                map.put(10, map.getOrDefault(5, 0)+1);
                return true;
            }
        }
        else{
            if((map.get(10)>=1&&map.get(5)>=1)||(map.get(5)>=3)){
                sum+=5;
                if ((map.get(10)>=1&&map.get(5)>=1)){
                    map.put(10,map.get(10)-1);
                    map.put(5, map.get(5)-1);
                    map.put(20, map.getOrDefault(20, 0)+1);
                }
                else
                {
                    map.put(5, map.get(5)-3);
                    map.put(20, map.getOrDefault(20, 0)+1);
                }
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{5,10,10,10,20};
        Soltion s=new Soltion();
        System.out.println(s.billsChange(a));
    }
}
