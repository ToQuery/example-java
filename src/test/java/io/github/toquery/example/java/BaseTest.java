package io.github.toquery.example.java;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

/**
 *
 */
public class BaseTest {
    protected static final Log LOG = LogFactory.get();


    protected static void LOG_SPLIT() {
        System.out.println();
        LOG.info("------------------------------------------------------------------------");
        System.out.println();
    }

}
