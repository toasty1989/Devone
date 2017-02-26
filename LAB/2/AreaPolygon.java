/**
 * file: AreaPolygon.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 1
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will calculate an area of a pentagon.
 */

import java.util.Scanner;

public class AreaPolygon {

  public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the number of sides: ");
    double sides = input.nextDouble();
        
    System.out.println("Enter the side: ");
    double side = input.nextDouble();
        
    //Equation for calculating the area of a Polygon
    double polyArea = (sides * side * side) / (4 * Math.tan(Math.PI / 5));
        
    System.out.println("The area of the Polygon is: " +polyArea);
        
  }
    
}
