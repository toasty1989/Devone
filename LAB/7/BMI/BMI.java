/**
 * file: BMI.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 7 Chap 10, exercise 2
 * due date: Apr 20, 2017
 * version: 1.8
 *
 * This File contains a code that will locate a maximum value and
 * its location in a 2 dimensional array.
 */ 
public class BMI {
   private String name;
   private int age;
   private double weight; // in pounds
   private double feet; // in feet
   private double inches; // in inches
   public static final double KILOGRAMS_PER_POUND = 0.45359237;
   public static final double METERS_PER_INCH = 0.0254;
   
   public BMI(String name, int age, double weight, double feet, double inches) {
     this.name = name;
     this.weight = weight;
     this.age = age;
     this.feet = feet;
     this.inches = inches;
   }
   //CONSTRUCTOR
   public BMI(String name, double weight, double feet, double inches) {
     this(name, 20, weight, feet, inches);
   }
   
   public double getBMI() {
     double height = (feet * 12) + inches;
     double bmi = weight * KILOGRAMS_PER_POUND /
             ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
     return Math.round(bmi * 100) / 100.0;
   }
   
   public String getStatus() {
     double bmi = getBMI();
     if (bmi < 18.5)
       return "Underweight";
     else if (bmi < 25)
       return "Normal";
     else if (bmi < 30)
       return "Overweight";
     else
       return "Obese";
   }
   
   public String getName() {
     return name;
   }
   
   public int getAge() {
     return age;
   }
   
   public double getWeight() {
     return weight;
   }
   
   public double getFeet() {
     return feet;
   }
   
   public double  getInches() {
     return inches;
   }
  }
  
