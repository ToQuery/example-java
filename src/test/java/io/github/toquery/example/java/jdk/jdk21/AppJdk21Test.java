package io.github.toquery.example.java.jdk.jdk21;

import io.github.toquery.example.java.BaseTest;
import io.github.toquery.example.java.model.Score;
import io.github.toquery.example.java.model.sealed.*;
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
            log.info("hello wolrd virtual thread");
        });
    }


    /**
     * 方法二：创建虚拟线程但不自动运行，手动调用 start () 开始运行
     */
    @Test
    public void createVirtualThread2() {
        Thread vt = Thread.ofVirtual().unstarted(() -> {
            log.info("hello wolrd virtual thread");
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
            log.info("Start virtual thread...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("End virtual thread. ");
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
            log.info("Start virtual thread...");
            Thread.sleep(1000);
            log.info("End virtual thread.");
            return true;
        });
    }

    @Test
    public void sequencedCollectionsTest(){

    }


    static void testStringNew(String response) {
        switch (response) {
            case null -> { }
            case "y", "Y" -> {
                System.out.println("You got it");
            }
            case "n", "N" -> {
                System.out.println("Shame");
            }
            case String s
                    when s.equalsIgnoreCase("YES") -> {
                System.out.println("You got it");
            }
            case String s
                    when s.equalsIgnoreCase("NO") -> {
                System.out.println("Shame");
            }
            case String s -> {
                System.out.println("Sorry?");
            }
        }
    }

    /**
     * Pattern matching for Switch
     */
    @Test
    public void patternMatchingForSwitchTest() {
        testStringNew("ss");


        Score score = new Score("张三", 99);
        print(score);
        print("历史");
        print(1L);

        Teacher teacher = new Teacher();
        switchClass(teacher);

        Worker worker = new Worker();
        switchClass(worker);

        GraduateStudent graduateStudent = new GraduateStudent();
        switchClass(graduateStudent);

        Student student = new Student();
        switchClass(student);

    }

    public void print(Object o) {
        switch (o) {
            case Score(String name, Integer value) -> log.info("score: name={}, value={}", name, value);
            case String s            -> log.info("string: {}", s);
            default                  -> log.info("unknown: {}", o);
        }
    }

    public void switchClass(Person person) {
        switch (person) {
            case null -> log.info("null");
            case Teacher teacher -> log.info("teacher: {}", teacher);

            case AnyWorkerClass worker   -> log.info("AnyWorkerClass: {}", worker);
            case Worker worker   -> log.info("worker: {}", worker);

            case GraduateStudent student -> log.info("GraduateStudent: {}", student);
            case MiddleSchoolStudent student -> log.info("MiddleSchoolStudent: {}", student);
            case Student student -> log.info("student: {}", student);

            default -> log.error("Unexpected value: " + person);
        }
    }
}
