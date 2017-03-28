/**
 * file: Driver_prj1.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Project 1, Convolution of 2 Vectors
 * due date: March 19, 2017
 * version: 1.8
 *
 * Convolution of two vectors.
 * 
 */
import java.util.Scanner;
public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Store first vector Size
    System.out.println("Please enter the size of the first vector: ");
     int size1 = input.nextInt();
      double[] array1 = new double[size1];
    // Store second vector Size   
    System.out.println("Please enter the size of the 2nd vector: ");
     int size2 = input.nextInt();
      double[] array2 = new double[size2];
     //Store first array numbers into indexes 
    System.out.println("Please enter the elements of the 1st vector: ");
     for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextDouble();
     }
     //Store second array numbers into indexes
    System.out.println("Please enter the elements of the 2nd vector: ");
     for (int j = 0; j < array2.length; j++) {
      array2[j] = input.nextDouble();
     }
     //invoke method convolveVectors with 
     double[] vResult = convolveVectors(array1, array2);
     System.out.print("The new Vector is: ");
     for (int i = 0; i < vResult.length; i++) {
      System.out.print((int) vResult[i] + " ");
     }
     System.out.print(" \n");
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
   //new size of the return array
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];

    for (int i = 0; i < vResult.length; i++) {

      for (int shift = 0; shift < vSecond.length ; shift++) {
        // Try catch will prevent the out of bounds issues.
        // Try will continue to apply formula
        // Catch will check out of bounds but do nothing
        try {
          vResult[i] += (vFirst[i - shift] * vSecond[shift]); 
        } 
        catch (IndexOutOfBoundsException e) {
        }
      }
    }
    return vResult; 
  } 
}
