/**
 * file: PhoneKeyPad.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 15
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will prompt the user to enter y for yes 
 * and n for no instead of 1 for yes and 2 for no.
 */

import java.util.Scanner;

public class PhoneKeyPad {

  public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
    //Prompt user for a letter
    System.out.println("Enter a letter: ");
    String answer = input.nextLine();
        
    //Floating number until given a value
    int number = 0;
        
    //Key pad 2
    String set1 = "abc";
        
    //Key pad 3
    String set2 = "def";
        
    //Key pad 4
    String set3 = "ghi";
        
    //Key pad 5
    String set4 = "jkl";
        
    //Key pad 6
    String set5 = "mno";
        
    //Key pad 7
    String set6 = "pqrs";
        
    //Key pad 8
    String set7 = "tuv";
        
    //Key pad 9
    String set8 = "wxyz";
        
    //Invalid inputs
    String set9 = "+=!@#$%&*^";
        
    //Checking to see whether the answer contains the letter within a String.
    if (set1.contains(answer))
      number = 2;
            
    else if (set2.contains(answer))
      number = 3;
        
    else if (set3.contains(answer))
      number = 4;
        
    else if (set4.contains(answer))
      number = 5;
        
    else if (set5.contains(answer))
      number = 6;
        
    else if (set6.contains(answer))
      number = 7;
        
    else if (set7.contains(answer))
      number = 8;
        
    else if (set8.contains(answer))
      number = 9;
        
    else if (set9.contains(answer))
      System.out.println(answer+ " is an invalid input");
            
    //Output of the corresponding number on the Key Pad.    
    System.out.println("The corresponding number is: " + number);
        
  }
    
}
