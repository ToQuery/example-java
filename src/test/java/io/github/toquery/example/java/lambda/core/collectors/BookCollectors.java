package io.github.toquery.example.java.lambda.core.collectors;


import io.github.toquery.example.java.lambda.entity.Book;

/**
 *
 */
public class BookCollectors {
    public static Double computeValue(Book book) {
        return book.price() * book.quantity();
    }
}
