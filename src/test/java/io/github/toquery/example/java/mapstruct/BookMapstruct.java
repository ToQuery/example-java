package io.github.toquery.example.java.mapstruct;

import io.github.toquery.example.java.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 *
 */
@Mapper
public interface BookMapstruct {

    BookMapstruct INSTANCE = Mappers.getMapper(BookMapstruct.class);

    @Mappings(value = {
            @Mapping(source = "localTime", target = "localTime", dateFormat = "HH:mm:ss"),
            @Mapping(source = "pressDate", target = "pressDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "publishDate", target = "publishDate", dateFormat = "yyyy-MM-dd"),
            @Mapping(source = "buyDateTime", target = "buyDateTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    BookVO book2BookVO(Book book);


    BookDTO book2BookDTO(Book book, String aliasName);
}
