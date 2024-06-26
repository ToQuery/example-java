package io.github.toquery.example.java.jdk.jdk11;

import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class AppJdk11Test extends BaseTest {
    @Test
    public void stringEnhance(){

        // 判断字符串是否为空白
        boolean isBlank = " ".isBlank();
        log.info("isBlank : {}", isBlank);

        String stripTrailing = " Javastack ".stripTrailing();  // " Javastack"
        log.info("stripTrailing : {}", stripTrailing);

        String stripLeading = " Javastack ".stripLeading();   // "Javastack "
        log.info("stripLeading : {}", stripLeading);

        String repeat = " Javastack ".repeat(2);   // " Javastack  Javastack "
        log.info("repeat : {}", repeat);

    }
}
