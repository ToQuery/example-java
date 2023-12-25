package io.github.toquery.example.java.jdk.jdk9;

import io.github.toquery.example.java.BaseTest;
import io.github.toquery.example.java.model.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 */
public class AppJdk9Test extends BaseTest {

    /**
     * ImmutableCollections 不可变集合
     */
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

    @Test
    public void steamEnhance(){
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // 从开头开始获取满足条件的元素，直到遇到第一个不满足条件的，然后返回前面满足条件的元素
        list.stream().takeWhile(i -> i < 3).forEach(System.out::println);

        // 从开头开始删除满足条件的元素，直到遇到第一个不满足条件的，然后返回剩余的元素
        list.stream().dropWhile(i -> i < 3).forEach(System.out::println);


        // 初始值从1开始，每次将前一个数乘以2
        Stream.iterate(1, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);

        // 也可以添加判断条件，当n大于10时停止
        Stream.iterate(1, n -> n <= 10, n -> n + 1)
                .forEach(System.out::println);

        // 生成自定义对象
        Stream.iterate(new User("John Wick", 30),
                        user -> new User(user.getName(), user.getAge() + 1))
                .limit(10)
                .forEach(System.out::println);

        // 生成斐波那契数列
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .mapToInt(arr -> arr[0])
                .limit(10)
                .forEach(System.out::println);

        // 生成无限序列的日期
        Stream.iterate(LocalDate.now(), date -> date.plusDays(1))
                .limit(10)
                .forEach(System.out::println);

    }
}
