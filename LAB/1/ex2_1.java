/**
   * file: ex2_1.java
   * author: Manfred Cabintoy
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jan 24, 2017
   * version: 1.8
   * 
   * This File contain a code that reads a conversion from degree 
      celsius to fahrenheit.
   */

//so we can use the input from the user
import java.util.Scanner;

public class ex2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Promt the user to enter a digit for celsius
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		//The conversion from celsius to fahrenheit
		double fahrenheit = (9.0 / 5 ) * celsius + 32.0;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}	