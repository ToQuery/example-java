package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import org.junit.jupiter.api.Test;

public class RxJava3OperatorsTest extends BaseTest {


    @Test
    public void testTransformingOperator() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable
                .map(String::toUpperCase)
                .subscribe( letter -> result.append(letter));
        System.out.println(result);
    }

    @Test
    public void testTFilteringOperator() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable
                .take(2)
                .subscribe( letter -> result.append(letter));
        System.out.println(result);
    }
    @Test
    public void testCombiningOperator() {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable1 = Observable.fromArray(letters);
        Observable<Integer> observable2 = Observable.fromArray(numbers);
        Observable.combineLatest(observable1, observable2, (a,b) -> a + b)
                .subscribe( letter -> result.append(letter));
        System.out.println(result);
    }
    @Test
    public void testUtilityOperator() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable.subscribe( letter -> result.append(letter));
        System.out.println(result);
    }
    @Test
    public void testConditionalOperator() {
        final StringBuilder result = new StringBuilder();
        Observable.empty()
                .defaultIfEmpty("No Data")
                .subscribe(s -> result.append(s));
        System.out.println(result);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result1 = new StringBuilder();
        Observable.fromArray(letters)
                .firstElement()
                .defaultIfEmpty("No data")
                .subscribe(s -> result1.append(s));
        System.out.println(result1);
    }

    @Test
    public void testMathematicalOperator() {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable1 = Observable.fromArray(letters);
        Observable<Integer> observable2 = Observable.fromArray(numbers);
        Observable.concat(observable1, observable2)
                .subscribe( letter -> result.append(letter));
        System.out.println(result);
    }



    @Test
    public void testConnectableOperator() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        ConnectableObservable<String> connectable = Observable.fromArray(letters).publish();
        connectable.subscribe(letter -> result.append(letter));
        System.out.println(result.length());
        connectable.connect();
        System.out.println(result.length());
        System.out.println(result);
    }
}
