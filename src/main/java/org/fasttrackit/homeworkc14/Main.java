package org.fasttrackit.homeworkc14;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        double result = temperature.celsiusToFahrenheit(200);
        double result2 = temperature.fahrenheitToCelsius(200);
        System.out.println(result);
        System.out.println(result2);
    }

}
