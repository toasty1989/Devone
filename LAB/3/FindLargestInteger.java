/**
 * file: FindLargestInteger.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 5, exercise 13
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code that will find the largest n
 * such that n^3 < 12,000.
 */

public class FindLargestInteger {
  public static void main(String[] args) {
    int n = 0;
    //loop to find (integers) ^3 that are less than 12000
    while (Math.pow(n, 3) < 12000) {
      n++;
    }
      n--;
    System.out.println(n + " is the largest integer n, such that n^3 is less then 12,000");
    //result closest to 12000
    System.out.println("result 1: " + n + "^3 = " + Math.pow(n, 3));     
  }
}
