package io.github.toquery.example.java.lambda.entity;


import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 */
@Builder
public record Book(Long id, String name, String author, Double price, Integer quantity, String press, LocalDate publishDate, LocalDateTime buyDateTime){

}
