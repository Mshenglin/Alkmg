package com.ProducerAndCustomer.await;

/**
 * 生产者
 *
 * @author mashenglin
 */
public class Producer implements Runnable {
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
                storage.put();  //生产产品

        }
    }
}
