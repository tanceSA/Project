package com.test05.communication;


/**
 * ClassName: ProducerConsumerTest
 * Package: com.test05.communication
 * Description:
 * 生產者(Productor)將產品交給店員(Clerk)，而消費者(Customer)從店員處取走產品，店員一次只能持
 * 有固定數量的產品(比如:20），如果生產者試圖生產更多的產品，店員會叫生產者停一下，如果店中有空位放
 * 產品了再通知生產者繼續生產；如果店中沒有產品了，店員 * 會告訴消費者等一下，如果店中有產品了再通知
 * 消費者來取走產品。
 *
 * @Author: TANCE
 * @Create 2023/3/31 下午 03:13
 * @Version 1.0
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {

        Clerk c = new Clerk();
        new Thread(new Producer(c), "生產者").start();
        new Thread(new Consumer(c), "消費者A").start();
        new Thread(new Consumer(c), "消費者B").start();
    }
}

class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }

}

class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }

    }
}

class Clerk {
    private int productNum = 0;
    private static final int MAX_PRODUCT = 20;
    private static final int MIN_PRODUCT = 0;


    public synchronized void addProduct() {
        if (productNum >= MAX_PRODUCT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName()+"生產了第" + (++productNum) + "件產品,剩下" + productNum + "個產品");
            notifyAll();//喚醒消費者
        }

    }

    public synchronized void minusProduct() {
        if (productNum <= MIN_PRODUCT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName()+"購買了第" + (productNum--) + "件產品,剩下" + productNum + "個產品");
            notifyAll();//喚醒生產者
        }
    }
}
