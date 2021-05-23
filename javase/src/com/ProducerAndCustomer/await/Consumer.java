package com.ProducerAndCustomer.await;

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
                storage.consume();  //生产产

        }
    }
}
