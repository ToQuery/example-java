package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import org.junit.jupiter.api.Test;

public class RxJava3SubjectsTest extends BaseTest {


    @Test
    public void testPublishSubject() {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();

        PublishSubject<String> subject = PublishSubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onComplete();

        //Output will be abcd
        System.out.println(result1);
        //Output will be d only
        //as subscribed after c item emitted.
        System.out.println(result2);
    }

    @Test
    public void testBehaviorSubject() {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();
        BehaviorSubject<String> subject =  BehaviorSubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onComplete();
        //Output will be abcd
        System.out.println(result1);
        //Output will be cd being BehaviorSubject
        //(c is last item emitted before subscribe)
        System.out.println(result2);
    }

    @Test
    public void testReplaySubject() {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();

        ReplaySubject<String> subject = ReplaySubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onComplete();

        //Output will be abcd
        System.out.println(result1);
        //Output will be abcd being ReplaySubject
        //as ReplaySubject emits all the items
        System.out.println(result2);
    }


    @Test
    public void testAsyncSubject() {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();

        AsyncSubject<String> subject =  AsyncSubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onComplete();

        //Output will be d being the last item emitted
        System.out.println(result1);
        //Output will be d being the last item emitted
        System.out.println(result2);
    }



}
