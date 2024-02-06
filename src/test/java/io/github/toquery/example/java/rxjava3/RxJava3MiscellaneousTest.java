package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RxJava3MiscellaneousTest extends BaseTest {


    @SneakyThrows
    @Test
    public void testBuffering() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4,
                5, 6, 7, 8, 9);

        observable.subscribeOn(Schedulers.io())
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .buffer(3)
                .subscribe(new Observer<List<Integer>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("Subscribed");
                    }
                    @Override
                    public void onNext(List<Integer> integers) {
                        System.out.println("onNext: ");
                        for (Integer value : integers) {
                            System.out.println(value);
                        }
                    }
                    @Override
                    public void onError(Throwable e) {
                        System.out.println("Error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Done! ");
                    }
                });
        Thread.sleep(3000);
    }

    @SneakyThrows
    @Test
    public void testWindowing() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4,
                5, 6, 7, 8, 9);

        observable.subscribeOn(Schedulers.io())
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .window(3)
                .subscribe(new Observer<Observable<Integer>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("Subscribed");
                    }
                    @Override
                    public void onNext(Observable<Integer> integers) {
                        System.out.println("onNext: ");
                        integers.subscribe(value -> System.out.println(value));
                    }
                    @Override
                    public void onError(Throwable e) {
                        System.out.println("Error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Done! ");
                    }
                });
        Thread.sleep(3000);
    }
}
