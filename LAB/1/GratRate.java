/**
   * file: GratRate.java
   * author: Manfred Cabintoy
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jan 24, 2017
   * version: 1.8
   * 
   * This File contain a code that reads the subtotal and the gratuity rate which then
     computes the gratuity and total.
   */

// need the scanner utility because we will be using the user's input
import java.util.Scanner;

public class GratRate {
	public static void main(String[] args) {
		
		// Assign Variables
		double gratuityRate, 
				gratuityTotal,
				total,
				subtotal;
		
		Scanner input = new Scanner(System.in);
		
		//Promt user to enter subtotal and gratuity rate
		System.out.print("Enter the subtotal and gratuity rate: ");
		
		//Use the user's input numbers 
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		gratuityTotal = subtotal * gratuityRate * .01;
		
		// compute the total gratuity
		total = subtotal + gratuityTotal;
		
		//gratuity output
		System.out.println("The gratuity rate is $" + gratuityTotal + " and total is $" + total);
	}
}	