package com.concurrent;

/**
 * @author mashenglin
 */
public class VolatileOne {
    int a=0;
    volatile boolean flag=false;
    public void writer(){
        a=1;
        flag=true;
    }
    public void reader(){
        if(flag){
            int i=a;
        }
    }
}
