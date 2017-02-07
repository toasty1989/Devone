
/**
 * file: SortIntegers.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 3, exercise 8
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will prompt the user to enter three integers
 * and display the integers in non-decreasing order.
 */
import java.util.Scanner;

public class SortIntegers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt user for 3 integers
        System.out.println("Please enter three integer");
        
        int firstInteger = input.nextInt();
        
        int secondInteger = input.nextInt();
        
        int thirdInteger = input.nextInt();
        
        //Use if, else if statement to check if integers inputted are <, >, = 
        //each other
        
        //Testing to see if firstInteger is the greatest number of the 3
        if (firstInteger > secondInteger && firstInteger > thirdInteger)
            System.out.println(+ secondInteger + "," + thirdInteger + "," + firstInteger);
        
        //Testing to see if secondInteger is the greatest number of the 3
        else if(secondInteger > firstInteger && secondInteger > thirdInteger)
            System.out.println(+ thirdInteger + "," + firstInteger + "," + secondInteger);
        
        //Testing to see if thirdInteger is the greatest number of the 3
        else if(thirdInteger > secondInteger && thirdInteger > firstInteger)
            System.out.println(+ firstInteger + "," + secondInteger + "," + thirdInteger);
          
    }
    
}
