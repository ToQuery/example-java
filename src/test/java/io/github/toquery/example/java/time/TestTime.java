package io.github.toquery.example.java.time;

import io.github.toquery.example.java.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class TestTime extends BaseTest {

    @Test
    public void testTime1(){
        Instant instant = Instant.now();
        log.info("getEpochSecond = {}",instant.getEpochSecond());
        log.info("getNano        = {}",instant.getNano());
        log.info("getLong        = {}",instant.getLong(ChronoField.NANO_OF_SECOND));
        log.info("getLong        = {}",instant.getLong(ChronoField.MICRO_OF_SECOND));
        log.info("getLong        = {}",instant.getLong(ChronoField.MILLI_OF_SECOND));
        log.info("getLong        = {}",instant.getLong(ChronoField.INSTANT_SECONDS));

    }
}
