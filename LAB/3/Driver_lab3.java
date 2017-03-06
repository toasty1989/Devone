/**
 * file: Driver_lab3.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Kattis
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a a code that measures a distance between point.
 */
import java.util.Scanner;

public class Driver_lab3 {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter first number: ");
        
        double X1 = input.nextDouble();
     
        System.out.print("Enter second number: ");
        
        double Y1 = input.nextDouble(); 
        
        System.out.print("Enter third number: ");
        
        double X2 = input.nextDouble();
                
        System.out.print("Enter fourth number: ");
        
        double Y2 = input.nextDouble();
        
        double p = 2;
        
        double distance = Math.pow(Math.pow((X1 - X2),p) + Math.pow((Y1 - Y2), p), 1/p);
        
        System.out.printf("The least distance between pairs of points is: %3.10f\n" + distance);
        
     
    }
    
}    
        
        
        
        
       
    

