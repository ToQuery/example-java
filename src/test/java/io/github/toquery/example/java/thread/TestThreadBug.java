package io.github.toquery.example.java.thread;

import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

public class TestThreadBug extends BaseTest {


    private static boolean fuck = true;

    @Test
    public void test() throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (TestThreadBug.fuck) {
                i++;
                log.info("i am inner run {}", i);
                System.out.println("i am inner run" + i);
            }
        }).start();
        Thread.sleep(3000);
        TestThreadBug.fuck = false;
        System.out.println("over");
        log.info("i am over");
    }
}
