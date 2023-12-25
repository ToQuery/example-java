package io.github.toquery.example.java.thread;


import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {



    @Test
    public void testRunnableImpl() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);//创建含有3个线程的线程池

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {

//                ResponseEntity<String> responseEntity = HttpClient.newHttpClient().getForEntity("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardNo=6215340301401370266&cardBinCheck=true", String.class);
//                System.out.println(responseEntity.getStatusCode() + responseEntity.getBody());
            });

            pool.execute(t);
            pool.submit(t);
        }

        Thread.sleep(600000L);
        System.out.println("i am run over");
    }

    static class TestThreadImpl extends Thread {
        @Override
        public void run() {

        }
    }

    @Test
    public void testTestThreadImpl() {
        for (int i = 0; i < 200; i++) {
            new TestThreadImpl().start();
        }
        System.out.println("i am run over");
    }


    //卖票程序的同步代码块实现示例
    class Ticket implements Runnable {
        // 定义100张票
        private int tickets = 10;

        public void run() {
            while (true) {
                sellTicket();
            }
        }

        private synchronized void sellTicket() {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票 ");
            }
        }
    }

    @Test
    public void testTestThreadSynchronized() {
        // 通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递。
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        // 调用线程对象的start方法开启线程。
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
