package io.github.toquery.example.java.rxjava3;

import io.github.toquery.example.java.BaseTest;
import io.github.toquery.example.java.lambda.CollectorsTest;
import io.github.toquery.example.java.model.Book;
import io.reactivex.rxjava3.core.Flowable;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class RxJava3FlowableTest  extends BaseTest {


    @Test
    public void testFlowable() {
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
