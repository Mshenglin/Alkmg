package com.ProducerAndCustomer.await;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 仓库
 * @author mashenglin
 */
public class  Storage{
    // 仓库最大存储量
    private final int MAX_SIZE = 10;
    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<Object>();
    Lock lock = new ReentrantLock();
    //仓库不满的条件
    Condition full = lock.newCondition();
    //仓库空的条件变量
    Condition empty = lock.newCondition();

    //生产者向容器中，生产
    public void put() {
        // 获得锁
        lock.lock();
        try {
            while (list.size() >= MAX_SIZE) {
                System.out.println("【生产者" + Thread.currentThread().getName()
                        + "】仓库已满");
                try {
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());

            // 唤醒其他所有线程、释放锁
            full.signalAll();
            empty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 消费
     */
 public  void consume(){
     //获取锁
     lock.lock();
     try{
         //仓库是否是空
         while(list.size()==0){
             System.out.println("仓库空");
             empty.await();
         }
         list.remove();
         System.out.println(Thread.currentThread().getName()+"消费了商品");
         System.out.println("【消费者" + Thread.currentThread().getName()
                 + "】消费一个产品，现库存" + list.size());
         full.signalAll();
         empty.signalAll();

     } catch (InterruptedException e) {
         e.printStackTrace();
     } finally {
         lock.unlock();
     }
 }
}
