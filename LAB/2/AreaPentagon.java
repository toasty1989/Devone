/**
 * file: AreaPentagon.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 1
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will calculate an area of a pentagon.
 */

import java.util.Scanner;

public class AreaPentagon {

  public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
    System.out.println("Enter length from the center of a pentagon to the vortex");
    double radius = input.nextDouble();
        
    //Equation for sides of the pentagon
    double sides = Math.sin(Math.PI / 5) * radius * 2 ;
        
    //Area equation for a pentagon
    double area = (5 * sides * sides) / (4 * Math.tan(Math.PI / 5));
        
    System.out.println("The area of the pentagon is: " + area);
        
  }
    
}
