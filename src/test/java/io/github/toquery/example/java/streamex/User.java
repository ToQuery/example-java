package io.github.toquery.example.java.streamex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author toquery
 * @version 1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String name;
    Role role;

    public User(String name) {
        this.name = name;
    }
}
