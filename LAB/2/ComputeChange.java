/**
 * file: ComputeChange.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 26
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will fix the possible loss of accuracy
 * when converting a float value to an int value.
 */

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {
       
        //create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Recieve Amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amountX = input.nextLine();
        
        //Open variable waiting for change
        int amount;
        
        //created to seperate dollars from cents
        int rem = amountX.indexOf('.');
        
        //Indentify dollar amount
        String dollars = amountX.substring(0, rem);
        
        //Identify remaining amount
        String cents = amountX.substring(rem + 1);
        
        //Converted string amount into an Integer
        amount = Integer.parseInt(dollars + cents);
        System.out.println(Integer.parseInt(dollars + cents));
        
        int remainingAmount = amount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Displays your total in dollars, quarters, dimes, nikels, pennies
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
        
    }
    
}
