package org.fasttrackit.homeworkc14;

public class Temperature {
    public  double fahrenheitToCelsius(double temperature){
       return (temperature-32)*5/9;
    }
    public  double celsiusToFahrenheit(double temperature){
         return (temperature*9/5)+32;

    }
}
