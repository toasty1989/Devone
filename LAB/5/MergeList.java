/**
 * file: CountLetters.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 7, exercise 31
 * due date: Mar 23, 2017
 * version: 1.8
 *
 * This File contains a code to merge two sorted lists.
 * 
 */
import java.util.Scanner;
public class MergeList {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);  
   //First Array List
   System.out.print("Enter List1: ");
   int array = input.nextInt();
   int[] list1 = new int[array];
   for (int i = 0; i < list1.length; i++)
     list1[i] = input.nextInt();
   //Second Array List
   System.out.print("Enter List2: ");
   array = input.nextInt();
   int[] list2 = new int[array];
   for (int i = 0; i < list2.length; i++)
     list2[i] = input.nextInt();
    //invoke Merge Mothod
    int[] newList = merge(list1, list2);
    //Display indexes of Array list
    for (int i = 0; i < newList.length; i++)
    System.out.print(newList[i] + " ");
    System.out.print("\n");
  }
  //Method Combines 2 arrays and return a single array
  public static int[] merge(int[] list1, int[] list2) {
    int array1=list1.length;
    int array2=list2.length;
    int[] result = new int[array1 + array2]; // new array size
    int a = 0, b = 0; 

    for(int i = 0 ; i < (array1 + array2); i++) {
      if ( a >= array1 ) {
        result[i] = list2[b];
        b++;
      }

        else if ( b >= array2) {
          result[i] = list1[a];
          a++;
        }

          else if ( list1[a] < list2[b]) {
              result[i] = list1[a];
              a++;
          }
            else {
              result[i] = list2[b];
              b++;
            }
    }
          return result;
  }
}

