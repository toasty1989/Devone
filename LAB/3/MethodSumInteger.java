/**
 * file: MethodSumInteger.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 6, exercise 2
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a method that computes the sum of the digits in an
 * integer.
 */
import java.util.Scanner;

public class MethodSumInteger {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Integer: ");
        
        int num = input.nextInt();
        
        System.out.println("The sum of the Digits is " + digitSum(num));
    }
    
    public static int digitSum (int num) {
        
        int sum = 0;
        
        while (num != 0) {
            
	    //calling first digit
            sum = sum + num % 10;
            
	    //calling second digit
            num = num / 10;
        }
        
        return sum;
    }
}
