package io.github.toquery.example.java.mapstruct;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


/**
 *
 */
public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car("Morris", 5, CarType.SEDAN, 1L, "1", LocalDate.now(), LocalTime.now(), LocalDateTime.now(), new Date());

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        //then
//        assertThat(carDto).isNotNull();
//        assertThat(carDto.getMake()).isEqualTo("Morris");
//        assertThat(carDto.getSeatCount()).isEqualTo(5);
//        assertThat(carDto.getType()).isEqualTo("SEDAN");
    }
}
