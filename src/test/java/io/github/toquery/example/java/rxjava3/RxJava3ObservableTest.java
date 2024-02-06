package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import io.reactivex.rxjava3.observers.DisposableMaybeObserver;
import io.reactivex.rxjava3.observers.DisposableSingleObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RxJava3ObservableTest extends BaseTest {


    @Test
    public void testObservable() {
//        String result = "";
//        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
//        Observable<String> observable = Observable.fromArray(letters);
//        observable.subscribe(
//                i -> result += i,  //OnNext
//                Throwable::printStackTrace, //OnError
//                () -> result += "_Completed" //OnCompleted
//        );
    }

    @SneakyThrows
    @Test
    public void testSingle() {
        //Create the observable
        Single<String> testSingle = Single.just("Hello World");

        //Create an observer
        Disposable disposable = testSingle
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(
                        new DisposableSingleObserver<String>() {

                            @Override
                            public void onError(Throwable e) {
                                e.printStackTrace();
                            }

                            @Override
                            public void onSuccess(String value) {
                                System.out.println(value);
                            }
                        });
        Thread.sleep(3000);
        //start observing
        disposable.dispose();
    }



    @SneakyThrows
    @Test
    public void testMaybe() {
//Create an observer
        Disposable disposable = Maybe.just("Hello World")
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableMaybeObserver<String>() {
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onSuccess(String value) {
                        System.out.println(value);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Done!");
                    }
                });
        Thread.sleep(3000);
        //start observing
        disposable.dispose();
    }


    @SneakyThrows
    @Test
    public void testCompletable() {
//Create an observer
        Disposable disposable = Completable.complete()
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableCompletableObserver() {
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }
                    @Override
                    public void onStart() {
                        System.out.println("Started!");
                    }
                    @Override
                    public void onComplete() {
                        System.out.println("Done!");
                    }
                });
        Thread.sleep(3000);
        //start observing
        disposable.dispose();
    }


    @SneakyThrows
    @Test
    public void testCompositeDisposable() {
        CompositeDisposable compositeDisposable = new CompositeDisposable();

        //Create an Single observer
        Disposable disposableSingle = Single.just("Hello World")
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(
                        new DisposableSingleObserver<String>() {
                            @Override
                            public void onError(Throwable e) {
                                e.printStackTrace();
                            }

                            @Override
                            public void onSuccess(String value) {
                                System.out.println(value);
                            }
                        });

        //Create an observer
        Disposable disposableMayBe = Maybe.just("Hi")
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableMaybeObserver<String>() {
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onSuccess(String value) {
                        System.out.println(value);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Done!");
                    }
                });

        Thread.sleep(3000);

        compositeDisposable.add(disposableSingle);
        compositeDisposable.add(disposableMayBe);

        //start observing
        compositeDisposable.dispose();
    }
}
