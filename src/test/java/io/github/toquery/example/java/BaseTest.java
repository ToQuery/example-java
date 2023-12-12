package io.github.toquery.example.java;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.util.Map;

/**
 *
 */
public class BaseTest {
    protected static final Log LOG = LogFactory.get();

    protected static final String separation = "------------------------------------------------------------------------";

    protected static void LOG_SPLIT() {
        System.out.println();
        LOG.info(separation);
        System.out.println();
    }


    /**
     * 打印日志
     */
    public static void printLog(Iterable<?> list) {
        list.forEach(item -> LOG.info(item.toString()));
    }

    public static void printLog(Map<?, ?> map) {
        map.forEach((k, v) -> LOG.info("{} : {}", k, v));
    }

}
