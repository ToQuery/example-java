package io.github.toquery.example.java.jdk8;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class AppJdk8Test {
    @Test
    public void collection() {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);

        // k1,v1,k2,v2,...,形式创建
        Map<Integer, String> map1 = Map.of(1, "v1", 2, "v2");

        // 通过 Map.entry 形式创建
        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "v1"),
                Map.entry(2, "v2"),
                Map.entry(3, "v3"),
                Map.entry(4, "v4"));

        try {
            list.add(5);
            set.add(5);
            map1.put(5, "v5");
            map2.put(5, "v5");
        }catch (UnsupportedOperationException exception){
            exception.printStackTrace();
        }

    }

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
}
