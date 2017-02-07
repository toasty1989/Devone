/**
 * file: DaysMonth.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 3, exercise 11
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will prompt the user for a year and integer in
 * order to find the number of days in a month.
 */

import java.util.Scanner;

public class DaysMonth {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Each number inserted is equivalent to a month
        System.out.print("Enter a Month number between 1-12: ");
        int month = input.nextInt();
        
        // Showcase the Year, month and number of days for each case
        switch (month % 12) {
            case 1: System.out.println(+ year + ", January - 31 days "); break;
            case 2: System.out.println(+ year + ", February - 28 days "); break;               
            case 3: System.out.println(+ year + ", March - 31 days "); break;
            case 4: System.out.println(+ year + ", April - 30 days "); break;
            case 5: System.out.println(+ year + ", May - 31 days "); break;
            case 6: System.out.println(+ year + ", June - 30 days "); break;
            case 7: System.out.println(+ year + ", July - 31 days "); break;                
            case 8: System.out.println(+ year + ", August - 31 days "); break; 
            case 9: System.out.println(+ year + ", September - 30 days "); break;
            case 10: System.out.println(+ year + ", October - 31 days "); break;
            case 11: System.out.println(+ year + ", November - 30 days "); break;
            case 12: System.out.println(+ year + ", December - 31 days ");                
            
           
        }
        
    }
    
}
