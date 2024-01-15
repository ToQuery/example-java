package io.github.toquery.example.java.model.data;


import io.github.toquery.example.java.model.Book;
import io.github.toquery.example.java.model.BookType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
public class MockData {

    public static final MockData INSTANCE = new MockData();


    private MockData() {
    }

    /**
     * 图书数据，
     * <p>
     * 按出版社划分：化工出版社：Book 3，机械出版社：Book 1，电子出版社：Book 2，Book 4，Book 5
     * </p>
     * <p>
     * 按作者划分：John：Book 1，Book 4；Ethan：Book 2，Book 3，Book 5
     * </p>
     */
    public List<Book> books() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1L);
        book1.setName("Book 1");
        book1.setAuthor("John");
        book1.setPrice(1.1);
        book1.setQuantity(6);
        book1.setPress("机械出版社");
        book1.setPublishDate(LocalDate.of(1987, 3, 20));
        book1.setBuyDateTime(LocalDateTime.of(2001, 6, 7, 11, 20, 33));
        book1.setType(BookType.FICTION); // Set type
        book1.setSalesAmount(new BigDecimal("50.99")); // Set salesAmount
        book1.setPressDate(new Date());  // Set pressDate
        book1.setLocalTime(LocalTime.of(10, 30));  // Set localTime
        books.add(book1);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Book 2");
        book2.setAuthor("Ethan");
        book2.setPrice(2.1);
        book2.setQuantity(3);
        book2.setPress("电子出版社");
        book2.setPublishDate(LocalDate.of(1997, 9, 22));
        book2.setBuyDateTime(LocalDateTime.of(2021, 5, 7, 16, 22, 13));
        book2.setType(BookType.SYNTHESIZE); // Set type
        book2.setSalesAmount(new BigDecimal("75.50")); // Set salesAmount
        book2.setPressDate(new Date());  // Set pressDate
        book2.setLocalTime(LocalTime.of(12, 45));  // Set localTime
        books.add(book2);


        Book book3 = new Book();
        book3.setId(3L);
        book3.setName("Book 3");
        book3.setAuthor("Ethan");
        book3.setPrice(3.3);
        book3.setQuantity(7);
        book3.setPress("化工出版社");
        book3.setPublishDate(LocalDate.of(2018, 4, 12));
        book3.setBuyDateTime(LocalDateTime.of(2019, 10, 8, 12, 55, 24));
        book3.setType(BookType.SYNTHESIZE); // Set type
        book3.setSalesAmount(new BigDecimal("120.75")); // Set salesAmount
        book3.setPressDate(new Date());  // Set pressDate
        book3.setLocalTime(LocalTime.of(15, 0));  // Set localTime
        books.add(book3);

        Book book4 = new Book();
        book4.setId(4L);
        book4.setName("Book 4");
        book4.setAuthor("John");
        book4.setPrice(4.4);
        book4.setQuantity(6);
        book4.setPress("电子出版社");
        book4.setPublishDate(LocalDate.of(2015, 6, 6));
        book4.setBuyDateTime(LocalDateTime.of(2022, 5, 27, 6, 27, 35));
        book4.setType(BookType.FICTION); // Set type
        book4.setSalesAmount(new BigDecimal("90.25")); // Set salesAmount
        book4.setPressDate(new Date());  // Set pressDate
        book4.setLocalTime(LocalTime.of(18, 20));  // Set localTime
        books.add(book4);

        Book book5 = new Book();
        book5.setId(5L);
        book5.setName("Book 5");
        book5.setAuthor("Ethan");
        book5.setPrice(5.1);
        book5.setQuantity(5);
        book5.setPress("电子出版社");
        book5.setPublishDate(LocalDate.of(1995, 5, 25));
        book5.setBuyDateTime(LocalDateTime.of(2015, 5, 5, 15, 25, 53));
        book5.setType(BookType.SYNTHESIZE); // Set type
        book5.setSalesAmount(new BigDecimal("60.80")); // Set salesAmount
        book5.setPressDate(new Date());  // Set pressDate
        book5.setLocalTime(LocalTime.of(9, 10));  // Set localTime
        books.add(book5);

        return books;
    }


}
