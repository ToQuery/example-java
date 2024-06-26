package io.github.toquery.example.java.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookVO {

    private String id;
    private String type;
    private String typeName;
    private String name;
    private String author;
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


    private String pressDate;

    private String localTime;

    /**
     * 发行日期
     */
    private String publishDate;

    /**
     * 购买时间
     */
    private String buyDateTime;
}
