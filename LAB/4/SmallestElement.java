/**
 * file: SmallestElement.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 7, exercise 9
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code to find the smallest element in an array with
 * a method.
 * 
 */
import java.util.Scanner;
public class SmallestElement {
  static final int TEN = 10;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter " + TEN + " numbers: ");
    double[] numbers = new double[TEN];  
    //store each number into an array position
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }
    System.out.println("The smallest element is : " +min(numbers));
  }
  
  public static double min(double[] array) {
    double leastElement = array[0];
    //Loop for every possible char position
    for (int i = 0; i < array.length; i++) {
      //check each position for a-z or A-Z
      if(leastElement > array[i])
        leastElement = array[i];
    }
      return leastElement;
  }
}