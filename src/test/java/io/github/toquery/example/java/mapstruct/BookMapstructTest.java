package io.github.toquery.example.java.mapstruct;


import io.github.toquery.example.java.BaseTest;
import io.github.toquery.example.java.model.Book;
import io.github.toquery.example.java.model.data.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 *
 */
public class BookMapstructTest extends BaseTest {

    @Test
    public void book2BookVOTests() {
        List<Book> books = MockData.INSTANCE.books();

        Book book = books.get(0);
        //when
        BookVO bookVO = BookMapstruct.INSTANCE.book2BookVO(book);

        printObject(bookVO);
    }


    @Test
    public void book2BookDTOTests() {
        List<Book> books = MockData.INSTANCE.books();
        Book book = books.get(0);
        //when
        BookDTO bookDTO = BookMapstruct.INSTANCE.book2BookDTO(book, "my-book-1");

        printObject(bookDTO);

    }
}
