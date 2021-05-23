package com.ProducerAndCustomer.BlocingQueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author mashenglin
 */
public class Storage {
    private LinkedBlockingQueue<Object> list=new LinkedBlockingQueue<>(10);
    public void put(){
        try {
            list.put(new Object());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("【生产者" + Thread.currentThread().getName()
                + "】生产一个产品，现库存" + list.size());
}
//到达容量会自动的阻塞
public void consume(){
    try {
        list.take();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("【消费者" + Thread.currentThread().getName()
            + "】消费了一个产品，现库存" + list.size());
}
}
