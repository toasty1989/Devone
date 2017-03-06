/**
 * file: PalindromeTest.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 6, exercise 3
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a method prompts the user to enter an integer 
 * and reports whether the integer is a palindrome.
 */
import java.util.Scanner;
public class PalindromeTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Integer: ");
    int num = input.nextInt();
    if (isPalindrome(num)) {
      System.out.println(num + " is a palindrome.");
    }
    else {
      System.out.println(num + " is NOT a palindrome.");
    }
  }
    
    public static int reverse(int number) {
      //Return and test the reversal on input integer
      int reverse = 0;
      while (number != 0) {
        reverse = reverse * 10;
        //calls the first digit
        reverse = reverse + number % 10;
        //calls second digit
        number = number / 10;
      }
      return reverse;
    }
   
    public static boolean isPalindrome(int number) {
      //test is reversal of integer is the same as original
      return (number == reverse(number));     
    }
}
