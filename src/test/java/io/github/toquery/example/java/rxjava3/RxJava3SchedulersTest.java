package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.Executors;

public class RxJava3SchedulersTest extends BaseTest {


    @SneakyThrows
    @Test
    public void testTrampoline() {
        Observable.just("A", "AB", "ABC")
                .flatMap(v -> getLengthWithDelay(v)
                        .doOnNext(s -> System.out.println("Processing Thread "
                                + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.trampoline()))
                .subscribe(length -> System.out.println("Receiver Thread "
                        + Thread.currentThread().getName()
                        + ", Item length " + length));

        Thread.sleep(10000);
    }


    protected static Observable<Integer> getLengthWithDelay(String v) {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(3) * 1000);
            return Observable.just(v.length());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SneakyThrows
    @Test
    public void testNewThread() {
        Observable.just("A", "AB", "ABC")
                .flatMap(v -> getLengthWithDelay(v)
                        .doOnNext(s -> System.out.println("Processing Thread "
                                + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.newThread()))
                .subscribe(length -> System.out.println("Receiver Thread "
                        + Thread.currentThread().getName()
                        + ", Item length " + length));

        Thread.sleep(10000);
    }

    @SneakyThrows
    @Test
    public void testComputation() {
        Observable.just("A", "AB", "ABC")
                .flatMap(v -> getLengthWithDelay(v)
                        .doOnNext(s -> System.out.println("Processing Thread "
                                + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.computation()))
                .subscribe(length -> System.out.println("Receiver Thread "
                        + Thread.currentThread().getName()
                        + ", Item length " + length));

        Thread.sleep(10000);
    }

    @SneakyThrows
    @Test
    public void testIO() {
        Observable.just("A", "AB", "ABC")
                .flatMap(v -> getLengthWithDelay(v)
                        .doOnNext(s -> System.out.println("Processing Thread "
                                + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.io()))
                .subscribe(length -> System.out.println("Receiver Thread "
                        + Thread.currentThread().getName()
                        + ", Item length " + length));

        Thread.sleep(10000);
    }



    @SneakyThrows
    @Test
    public void testFrom() {
        Observable.just("A", "AB", "ABC")
                .flatMap(v -> getLengthWithDelay(v)
                        .doOnNext(s -> System.out.println("Processing Thread "
                                + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.from(Executors.newFixedThreadPool(3))))
                .subscribe(length -> System.out.println("Receiver Thread "
                        + Thread.currentThread().getName()
                        + ", Item length " + length));

        Thread.sleep(10000);
    }


}
