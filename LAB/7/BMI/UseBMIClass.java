
/**
 * file: UseBMIClass.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 7 Chap 10, exercise 2
 * due date: Apr 20, 2017
 * version: 1.8
 *
 * The code will allow me to reference my BMI class
 */ 

public class UseBMIClass {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Manfred Cabintoy", 27, 180, 5, 6);
    System.out.println("The BMI for " + bmi1.getName() +
            " is " + bmi1.getBMI() + " " + bmi1.getStatus());
  }
}