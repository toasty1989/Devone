/**
 * file: CelsiusF.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 6, exercise 8
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a method that converts Celsius to 
 * Fahrenheit.
 */
public class CelsiusF {
  public static void main(String[] args) {
   double[] celsius = {40.0, 39.0, 32.0, 31.0}; 
   double[] fahrenheit = {120.0, 110.0, 40.0, 30.0} ; 
    //Control float numbers by limiting decimal places for 2 conversions
    System.out.print("Celsius    Fahrenheit   |   Fahrenheit    Celsius\n");
    System.out.printf("40.0        %2.1f       |     120.0        %2.2f\n", celsiusToFahrenheit(celsius[0]) 
                    ,fahrenheitToCelcius(fahrenheit[0]));
    System.out.printf("39.0        %2.1f       |     110.0        %2.2f\n", celsiusToFahrenheit(celsius[1]) 
                    ,fahrenheitToCelcius(fahrenheit[1]));
    System.out.print("...\n");
    System.out.printf("32.0        %2.1f        |     40.0        %2.2f\n", celsiusToFahrenheit(celsius[2]) 
                    ,fahrenheitToCelcius(fahrenheit[2]));
    System.out.printf("31.0        %2.1f        |     30.0        %2.2f\n", celsiusToFahrenheit(celsius[3]) 
                    ,fahrenheitToCelcius(fahrenheit[3]));  
  }
  //conversion of celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    return (9.0 / 5) * celsius + 32;
  }
  //conversion of Fahrenheit to Celsius
  public static double fahrenheitToCelcius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32);
  }
}
