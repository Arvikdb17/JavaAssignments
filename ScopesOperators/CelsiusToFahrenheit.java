package ScopesOperators;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public  static void main(String[] args){
    //Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius: ");
    double celsiusTemperature = scanner.nextDouble();
    double fahrenheitTemperature = (celsiusTemperature * 9.0 / 5.0) + 32.0;
    System.out.println("Temperature in Fahrenheit: "+fahrenheitTemperature);
    scanner.close();
}
}
