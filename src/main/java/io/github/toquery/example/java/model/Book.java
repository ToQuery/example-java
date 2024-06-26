package io.github.toquery.example.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Book {

    private Long id;

    private String name;

    private String author;

    private BookType type;

    private BigDecimal salesAmount;
    /**
     * 单价
     */
    private Double price;
    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 出版社
     */
    private String press;

    private Date pressDate;

    private LocalTime localTime;

    /**
     * 发行日期
     */
    private LocalDate publishDate;

    /**
     * 购买时间
     */
    private LocalDateTime buyDateTime;
}
