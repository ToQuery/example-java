package io.github.toquery.example.java.jdk12;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 */
public class AppJdk12Test {
    @Test
    public void httpClient() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        // 构建请求
        HttpRequest req = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.baidu.com"))
                .build();

        // 发送请求
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp.body());

    }


    public void switchEnhance(){
        int i = 0;
        String res =  switch (i) {
            case 1 -> "1";
            default -> "0";
        };
    }
}
