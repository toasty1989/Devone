/**
 * file: LotteryGame.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 3, exercise 15
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that compare your 3 numbers with the winning
 * lottery numbers.
 */

import java.util.Scanner;

public class LotteryGame {

    public static void main(String[] args) {
        
        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000);
        
        //Prompt user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (three digits):");
        int guess = input.nextInt();
        
        //Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;
        
        //Get digits from user
        int lotteryGuess1 = lottery / 100;
        int lotteryGuess2 = lottery % 100 / 10;
        int lotteryGuess3 = lottery % 10;
        
        System.out.println("The lottery number is : " + lottery);
        
        
        //Comparing to see all possible matches    
        if(guess == lottery) 
            System.out.println("Exact match: you win $10,000");
            
        //Checking to see if you match all digits
        else if (lotteryGuess1 == lotteryDigit2 &&
                lotteryGuess2 == lotteryDigit3 &&
                lotteryGuess3 == lotteryDigit1) 
            System.out.println("Match all digits: you win $3,000");
        
        //Checking to see if you match at least one digit
        else if (lotteryGuess1 == lotteryDigit1 ||
                 lotteryGuess1 == lotteryDigit2 ||
                 lotteryGuess1 == lotteryDigit3 ||
                 lotteryGuess2 == lotteryDigit1 ||
                 lotteryGuess2 == lotteryDigit2 ||
                 lotteryGuess2 == lotteryDigit3 ||
                 lotteryGuess3 == lotteryDigit1 ||
                 lotteryGuess3 == lotteryDigit2 ||
                 lotteryGuess3 == lotteryDigit3) 
            System.out.println("Match one digit: you win $1,000");  
           
        else  
            System.out.println("Sorry, no match");
           
    }
    
}
