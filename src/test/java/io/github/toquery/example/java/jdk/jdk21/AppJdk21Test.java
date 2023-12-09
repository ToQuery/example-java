package io.github.toquery.example.java.jdk.jdk21;

import io.github.toquery.example.java.BaseTest;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class AppJdk21Test extends BaseTest {


    /**
     * 方法一：直接创建虚拟线程
     */
    @Test
    public void createVirtualThread1() {
        Thread vt = Thread.startVirtualThread(() -> {
            LOG.info("hello wolrd virtual thread");
        });
    }


    /**
     * 方法二：创建虚拟线程但不自动运行，手动调用 start () 开始运行
     */
    @Test
    public void createVirtualThread2() {
        Thread vt = Thread.ofVirtual().unstarted(() -> {
            LOG.info("hello wolrd virtual thread");
        });
        vt.start();
    }


    /**
     * 方法三：通过虚拟线程的 ThreadFactory 创建虚拟线程
     */
    @Test
    public void createVirtualThread3() {

        ThreadFactory tf = Thread.ofVirtual().factory();
        Thread vt = tf.newThread(() -> {
            LOG.info("Start virtual thread...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            LOG.info("End virtual thread. ");
        });
        vt.start();

    }


    /**
     * 方法四：Executors.newVirtualThreadPer -TaskExecutor()
     */
    @Test
    public void createVirtualThread4() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            LOG.info("Start virtual thread...");
            Thread.sleep(1000);
            LOG.info("End virtual thread.");
            return true;
        });
    }
}
