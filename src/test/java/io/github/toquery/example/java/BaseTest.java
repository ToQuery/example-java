package io.github.toquery.example.java;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.toquery.example.java.jackson.Jackson;
import lombok.SneakyThrows;

import java.util.Map;

/**
 *
 */
public class BaseTest {


    protected static final Log log = LogFactory.get();

    protected static final String separation = "------------------------------------------------------------------------";

    protected static void LOG_SPLIT() {
        System.out.println();
        log.info(separation);
        System.out.println();
    }


    @SneakyThrows
    public static void printObject(Object object) {
        log.info(Jackson.getObjectMapper().writeValueAsString(object));
    }

    /**
     * 打印日志
     */
    public static void printLog(Iterable<?> list) {
        list.forEach(item -> log.info(item.toString()));
    }

    public static void printLog(Map<?, ?> map) {
        map.forEach((k, v) -> log.info("{} : {}", k, v));
    }

}
