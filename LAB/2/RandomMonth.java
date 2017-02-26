
/**
 * file: RandomMonth.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 3, exercise 4
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contain a code that will generate an integer between 1 and 12
 * and displays the English month name January, February,...where the number
 * corresponds with the month.
 */
import java.util.Scanner;

public class RandomMonth {

  public static void main(String[] args) {

    /** Generate an integer between 1 and 12 using Math.random */
    int randomMonth = (int) (Math.random() * 12) + 1;
    System.out.println("The random number generated is: " + randomMonth);
        
    if (randomMonth == 1)
      System.out.println("The month is January");

    else if (randomMonth == 2)
      System.out.println("The month is February");

    else if (randomMonth == 3)
      System.out.println("The month is March");

    else if (randomMonth == 4)
      System.out.println("The month is April");

    else if (randomMonth == 5)
      System.out.println("The month is May");

    else if (randomMonth == 6)
      System.out.println("The month is June");

    else if (randomMonth == 7)
      System.out.println("The month is July");

    else if (randomMonth == 8)
      System.out.println("The month is August");

    else if (randomMonth == 9)
      System.out.println("The month is September");

    else if (randomMonth == 10)
      System.out.println("The month is October");

    else if (randomMonth == 11)
      System.out.println("The month is November");

    else if (randomMonth == 12)
      System.out.println("The month is December");

  }
}
