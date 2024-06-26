package io.github.toquery.example.java.lambda.core.collectors;


import io.github.toquery.example.java.model.Book;

/**
 *
 */
public class BookCollectors {
    public static Double computeValue(Book book) {
        return book.getPrice() * book.getQuantity();
    }
}
