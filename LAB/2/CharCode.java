/**
 * file: CharCode.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 8
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will find the character
 *  of an ASCII code.
 */
import java.util.Scanner;

public class CharCode {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);    
        
        System.out.println("Enter an Integer between 0-127: ");
        int ch = input.nextInt();
        
        //casting an integer into a character  
        char cha = (char)ch;
        
        System.out.println("The letter is: " + cha);
        
    }
    
}
