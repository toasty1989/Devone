/**
   * file: ex2_6.java
   * author: Manfred Cabintoy
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jan 24, 2017
   * version: 1.8
   * 
   * This File contain a code that reads an integer between 
      0 - 1000 and adds all the digits in the integer.
   */

// need the scanner utility because we will be using the user's input
import java.util.Scanner;

public class ex2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//Prompt User for for a number between 0-1000
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int fDigit = number % 10;
		int remainingNumber = number / 10;
		int sDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int tDigit = remainingNumber % 10;
		int sum = tDigit + sDigit + fDigit;
		
		//Output of the all the digits
		System.out.println("The sum of the digits is " + sum);
	}
	
}	