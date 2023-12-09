package io.github.toquery.example.java.jdk.jdk11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 */
public class AppJdk11Test {
    @Test
    public void stringEnhance(){

        // 判断字符串是否为空白
        " ".isBlank();
        " Javastack ".stripTrailing();  // " Javastack"
        " Javastack ".stripLeading();   // "Javastack "
    }
}
