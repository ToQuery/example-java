package io.github.toquery.example.java.model;

/**
 *
 */
public enum BookType {
    FICTION("小说"),
    SYNTHESIZE("综合"),
    ;


    BookType(String name) {
        this.name = name;
    }

    private String name;
}
