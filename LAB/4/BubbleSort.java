/**
 * file: BubbleSort.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 7, exercise 18
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code that will bubble sort double numbers.
 * 
 */

public class BubbleSort {
  public static void main(String[] args) {
    double[] numbers = new double[10];  
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Math.random() * 50;
    }
    //Method to Bubble Sort the random number between 1-49
    bubbleSort(numbers);
    //Displaying the numbers in sequencial order
    arrayDisplay(numbers, 1);
  }
  //Bubble Sort that will check pairs of numbers to make change
  public static void bubbleSort(double[] nums) {
    boolean flag;
    double temp;
    do {
      flag = false;
      for (int i = 0; i < nums.length - 1; i++) {
        if(nums[i] > nums[i + 1]) {
          temp = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = temp;
          flag = true;
        }
      }
    } while (flag);
  }
  //Method to display radomly generated numbers in ascending order
  public static void arrayDisplay(double[] array, int numPer) {
    for (int i = 0; i < array.length; i ++) {
      System.out.printf(" %2.2f \n", array[i]);
      if ((i + 1) % numPer == 0) System.out.println("");
    }
  }
}  