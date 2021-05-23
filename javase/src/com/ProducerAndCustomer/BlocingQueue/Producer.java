package com.ProducerAndCustomer.BlocingQueue;

/**
 * 生产者
 *
 * @author mashenglin
 */
public class Producer implements Runnable {
    private final Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                storage.put();  //生产产品
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
