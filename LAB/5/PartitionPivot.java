/**
 * file: CountLetters.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 7, exercise 32
 * due date: Mar 23, 2017
 * version: 1.8
 *
 * This File contains a code to partition a list using a pivot point
 * 
 */
import java.util.Scanner;
public class PartitionPivot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Ask user to enter a list of numbers
    System.out.print("Enter List of Numbers: ");
    int list1 = input.nextInt();
    //Puts numbers into indexes
    int[] list2 = new int[list1];
    for(int i = 0; i < list2.length; i++)
      list2[i] = input.nextInt();
    //Print the pivot value of the list
    System.out.println("The pivot value is " + list2[0]);
    //Invoke list2 with partition method
    int[]finalList = partition(list2);
    System.out.print("The partition list is: ");
    for (int i = 0; i < finalList.length; i++) {
      System.out.print(finalList[i] + " ");
    }
    System.out.print(" \n");
  }
  public static int[] partition(int[] list2) {
    int pivot = list2[0]; //pivot point is after the first number after the first
    int a = 1;
    int b = list2.length - 1;
    while(a < b) {
      if(list2[a] > pivot) { //comparing if int a is greater than the pivot number
        if(list2[b] <= pivot) { // inverse relationship
          int temp = list2[a];
          list2[a] = list2[b]; 
          list2[b] = temp;
          b--;
        }
       
        else {
          b--;
          a--;
        }
      }
      a++;
    }
   //swapping
   int temp = pivot;
     list2[0] = list2[a - 1];
     list2[a - 1] = temp;
   //original list is partitioned and now returned
   return list2;
  }
}
