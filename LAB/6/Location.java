/**
 * file: Location.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 6 Chap 9, exercise 13
 * due date: Apr 15, 2017
 * version: 1.8
 *
 * This File contains a code that will locate a maximum value and
 * its location in a 2 dimensional array.
 */ 
 import java.util.Scanner;
 public class Location {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of rows and columns in the array: ");
      int row = input.nextInt();
      int column = input.nextInt();
      double array[][] = new double[row][column];
      
      //Storing numbers into an array
      System.out.print("Enter the array: ");
      
      for (int i = 0; i < array.length; i++) {
        System.out.println("");
        for (int j = 0; j < array[i].length; j++) {
          array[i][j] = input.nextDouble();
        }
      }
      findLargest(array); //invoke method returning newlocation
  }
  //public data field
  public static double maxValue = 0;
  public static int row = 0;
  public static int column = 0;
  static double[][] array = null;
  
  public static Location findLargest(double[][] array) {
    maxValue = array[1][1];
    int length1 = 0;
    int length2 = 0;
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array[i].length; j++) {
        //comparing if the value of [i][j] is > than current maxValue 
        if(array[i][j] > maxValue) {
          maxValue = array[i][j]; //Provides the actual largest value
          length1 = i;  //the first array position
          length2 = j;  //second array position
        }
      }
    }
    System.out.println("The location of the largest element is " + maxValue + 
                      " at " + "("+length1 + ", " +length2+ ")" );
    return new Location();
  }
} 
  
