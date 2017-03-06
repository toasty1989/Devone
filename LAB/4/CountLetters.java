/**
 * file: CountLetters.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 6, exercise 20
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a method that counts the numbers of letters in a string.
 */
import java.util.Scanner;
public class CountLetters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String answer = input.nextLine();
    System.out.println("The number of letters in the string is : " +countLetters(answer));
  }
  
  public static int countLetters(String s) {
    int count = 0;
    //Loop for every possible char position
    for (int i = 0; i < s.length(); i++) {
      //check each position for a-z or A-Z
      if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
         s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        count++;
    }
      return count;
  }
}
