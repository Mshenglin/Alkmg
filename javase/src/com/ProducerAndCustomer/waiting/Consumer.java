package com.ProducerAndCustomer.waiting;

/**
 * 消费者
 * @author mashenglin
 */
public class Consumer implements Runnable{
    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                storage.consume();  //生产产品
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
