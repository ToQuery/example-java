package io.github.toquery.example.java.jdk.jdk9;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class AppJdk9Test {

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
    public void tryWithResourcesEnhance(){
        InputStream inputStream = new StringBufferInputStream("a");
        try (inputStream) {
            inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
