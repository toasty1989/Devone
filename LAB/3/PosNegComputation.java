/**
 * file: PosNegComputation.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 5, exercise 1
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code that will count positive and negative numbers and 
 * compute the average of numbers .
 */
import java.util.Scanner;

public class PosNegComputation {

    public static void main(String[] args) {
        
        //Hold value for 
        int data; 
        
        int sum = 0;
        
        //Hold values for postive integers
        int positive = 0;
        
        //Hold values for negative integers
        int negative = 0;
        
	//holds the average
        double average = 0;
        
        //create a Scanner for integer input
        Scanner input = new Scanner(System.in);
        
        //keep reading data until the input is 0
        do {
            System.out.println(
                "Enter an integer(the input ends if it is 0): ");
            
	    data = input.nextInt();
            
            sum += data;
            
            if (data > 0) positive++;
            
            else if (data < 0) negative++;
              
        } while (data != 0.0);
        
        System.out.println("The number of positives is " + positive);
        
        System.out.println("The number of negatives is " + negative);
        
        System.out.println("The total is " + sum);
        
        average = sum /(double)(positive + negative);
        
        System.out.println("The average is " + average);
          
    }
    
}
