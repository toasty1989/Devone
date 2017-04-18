/**
 * file: Rectangle.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 6 Chap 9, exercise 1
 * due date: Apr 15, 2017
 * version: 1.8
 *
 * This File contains a code that will design a class
 * Rectangle to represent a rectangle,
 * display the width and height of 2 rectangle objects.
 * 
 */
public class Rectangle {

  public static void main(String[] args) {
    //create rectangle one
    Rectangle Rec1 = new Rectangle(4,40);
    System.out.printf("Rectangle 1 Width = %2.2f, Height = %2.2f, Area = %2.2f, "
            + "Perimeter =  %2.2f\n",Rec1.width, Rec1.height, Rec1.getArea(), 
            Rec1.getPerimeter());
    
    //create rectangle two
    Rectangle Rec2 = new Rectangle(3.5,35.9);
    System.out.printf("Rectangle 2 Width = %2.2f, Height = %2.2f, Area = %2.2f, "
            + "Perimeter =  %2.2f\n",Rec2.width, Rec2.height, Rec2.getArea(), 
            Rec2.getPerimeter());
  }
  
  //Data Field
  double width;
  double height;
  
  // no-arg constructor
  Rectangle() {
    width = 1;
    height = 1;
  }
  
  //second constructor with specified width and height
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  
  //Return the area of the rectangle
  double getArea() {
    return width * height;
  }
  
  //Return the perimeter of the rectangle
  double getPerimeter() {
    return (width * 2) + (height * 2);
  }
}
