package io.github.toquery.example.java.jdk.jdk13;

import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class AppJdk13Test extends BaseTest {
    public static final String text = """
            {
                'name': 'zhangsan',
                'age': 23
             }
            """;

    @Test
    public void textBlock() {
        log.info("text : {}", text);
        log.info("text.lines().count() : {}", text.lines().count());
    }

    @Test
    public void switchEnhance(){

        int number = 1;
        String str = switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };

        log.info("str : {}", str);
    }
}
