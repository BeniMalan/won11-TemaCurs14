package org.fasttrackit.homeworkc14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.fasttrackit.homeworkc14.Temperature;

public class TemperatureTest {
    @Test
    public void instantiateClass() {
        Temperature temperature = new Temperature();
    }

    @Test
    public void callMethod() {
        Temperature temperature = new Temperature();
        temperature.fahrenheitToCelsius(200);
        temperature.celsiusToFahrenheit(200);
    }

    @Test
    public void methodReturnsAnDouble() {
        Temperature temperature = new Temperature();
        double T = temperature.fahrenheitToCelsius(200);
        double T1 = temperature.celsiusToFahrenheit(200);
    }

    @Test
    public void methodReturnCelsius() {
        //given
        Temperature temperature = new Temperature();
        double T = 200;
        //when

        double result = temperature.fahrenheitToCelsius(200);
        //then

        Assertions.assertThat(result).isEqualTo(93.333333333333333);
    }

    @Test
    public void methodReturnFahrenheit() {
        //given
        Temperature temperature = new Temperature();
        double T = 200;
        //when
        double result = temperature.celsiusToFahrenheit(200);
        //then
        Assertions.assertThat(result).isEqualTo(392);
    }
}
