package com.ProducerAndCustomer.waiting;

import com.ProducerAndCustomer.await.Consumer;
import com.ProducerAndCustomer.await.Producer;
import com.ProducerAndCustomer.await.Storage;

/**
 * @author mashenglin
 */
public class Main {
    public static void main(String[] args) {
        //仓库
        com.ProducerAndCustomer.await.Storage storage=new Storage();
        //三个创建线程
        Thread t1=new Thread(new com.ProducerAndCustomer.await.Producer(storage));
        Thread t2=new Thread(new com.ProducerAndCustomer.await.Producer(storage));
        Thread t3=new Thread(new Producer(storage));
        //三个消费线程
        Thread c1=new Thread(new com.ProducerAndCustomer.await.Consumer(storage));
        Thread c2=new Thread(new com.ProducerAndCustomer.await.Consumer(storage));
        Thread c3=new Thread(new Consumer(storage));
        t1.start();
        t2.start();
        t3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
