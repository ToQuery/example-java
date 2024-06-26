package io.github.toquery.example.java.mapstruct;

import io.github.toquery.example.java.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BookDTO extends Book {

    private String aliasName;

}
