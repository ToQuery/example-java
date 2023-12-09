package io.github.toquery.example.java.jdk.jdk8;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;
import java.util.Optional;

/**
 *
 */
public class AppJdk8Test extends BaseTest {

    @Test
    public void localDateTime() throws IOException {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

    }

    public void optional() {
        // 创建一个 String 类型的容器
        Optional<String> str = Optional.of("str");
        // 值是否存在
        boolean pre = str.isPresent();
        // 值如果存在就调用 println 方法，这里传入的是 println 的方法引用
        str.ifPresent(System.out::println);
        // 获取值
        String res = str.get();
        // 传入空值
        str = Optional.ofNullable(null);
        // 如果值存在，返回值，否则返回传入的参数
        res = str.orElse("aa");
        str = Optional.of("str");
        // 如果有值，对其调用映射函数得到返回值，对返回值进行 Optional 包装并返回
        res = str.map(s -> "aa" + s).get();
        // 返回一个带有映射函数的 Optional 对象
        res = str.flatMap(s -> Optional.of(s + "bb")).flatMap(s -> Optional.of(s + "cc")).get();


    }

    // @Authors(value = {@Author(name = "")})
    @Author(name = "a")
    @Author(name = "b")
    public void repeatable() {

    }

    public void base64(){
        String base64 = Base64.getEncoder().encodeToString("aaa".getBytes());
        LOG.info(base64);
        byte[] bytes = Base64.getDecoder().decode(base64);
        LOG.info(new String(bytes));

    }


}
