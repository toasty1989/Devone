/**
 * file: CountLetters.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 7, exercise 20
 * due date: Mar 23, 2017
 * version: 1.8
 *
 * This File contains a code to find the largest number
 * 
 */
import java.util.Scanner;
public class LargestNumber {
  public static void main(String[] args) {
    //Ask user for 10 numbers starting with the # of indexes
    Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers: ");
      int array = input.nextInt();
      //Storing numbers into an array
      int[] arrayList = new int[array];
      for (int i = 0; i < arrayList.length; i++)
      arrayList[i] = input.nextInt();
    //Invoke array with method maxNum to sort smallest to largest
    maxNum(arrayList);
    for (int i = 0; i < arrayList.length; i++)
    System.out.print(arrayList[i] + " ");
    System.out.print(" \n");
  }
  
public static void maxNum(int[] numbers) {
  for (int i = 0; i < numbers.length - 1; i++) {
    for (int k = i ; k < numbers.length; k++) {
      if (numbers[i] > numbers[k]) {
        int temp = numbers[i];
        numbers[i] = numbers[k];   //Swapping
        numbers[k] = temp;
      }
    }
  }
}  
}
