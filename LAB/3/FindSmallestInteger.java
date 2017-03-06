/**
 * file: FindSmallestInteger.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 5, exercise 12
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code that will find the Smallest n
 * such that n^2 > 12,000.
 */

public class FindSmallestInteger {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n, 2) < 12000) {
      n++;
    }
      System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
      // Top result closest to 1200 with n^2  
      System.out.println("Result 2: " + n + "^2 = " + Math.pow(n, 2));
  }
}
