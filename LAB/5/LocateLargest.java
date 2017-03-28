/**
 * file: CountLetters.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 4 Chap 8, exercise 13
 * due date: Mar 23, 2017
 * version: 1.8
 *
 * This File contains a code to locate largest element 
 * in a multi-dimensional array.
 * 
 */
import java.util.Scanner;
public class LocateLargest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      //Ask user to input a multidimensional array [x,x]
      System.out.print("Enter the number of rows and columns of the array: ");
      int row = input.nextInt();
      int column = input.nextInt();
      double[][] multArr = new double[row][column];
      
      //Ask user to enter 2 sets of arrays
      System.out.println("Enter the array: ");
      for (int i = 0; i < multArr.length; i++) {//loop for rows
        for (int j = 0; j < multArr[i].length; j++) {//loop for columns
          multArr[i][j] = input.nextDouble();
        }  
      }
      //Invoke method on multArr to locate largest element
      int[] grid = findLargest(multArr);
      System.out.printf("The location of the largest element is at: (" + grid[0] +"," + grid[1] + ")\n");
  }
  
  public static int[] findLargest(double[][] grid) {
    double largest = grid[0][0];
    int row = 0;
    int column = 0;// locate the largest element
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] > largest) {
            row = i; // row
            column = j; // column
            largest = grid[i][j]; 
          }
        }
      }
        int[] atLarge = {row, column}; // location of the largest element
        return atLarge;
  }
}
