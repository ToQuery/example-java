package io.github.toquery.example.java.datetime;

import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeTests extends BaseTest {


    @Test
    public void testDateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("B");
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(1, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(11, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(14, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(17, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(18, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(21, 0))));
        log.info(formatter.format(LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 0))));
    }

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
