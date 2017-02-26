/**
   * file: Grade.java
   * author: Manfred Cabintoy
   * course: CMPT 220
   * assignment: Lab 2, grade
   * due date: Feb 5, 2017
   * version: 1.8
   * 
   * This File contain a code that reads the sum of his grades to 
     compute the final grade.
   */

// need the scanner utility because we will be using the user's input
import java.util.Scanner;

public class Grade {
  
  public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
		
    //Prompt the user to enter midterm grade
    System.out.print("Enter midterm exam grade: ");
    double mTerm = input.nextDouble();
		
    //Prompt user to enter final exam grade
    System.out.print("Enter final exam grade: ");
    double fExam = input.nextDouble();
		
    //Prompt the user to enter projects grade
    System.out.print("Enter projects grade: ");
    double projects = input.nextDouble();
		
    //Promt the user to enter homework and lab grades
    System.out.print("Enter homework and lab grades: ");
    double hGrades = input.nextDouble();
		
    //The sum of all grade / 4
    double fGrade = (mTerm + fExam + projects + hGrades) / 4;
    System.out.println("Your final grade is: " + fGrade + "%");
                
    //Comparing range of grade with if-else to produce letter grade
    if (fGrade <= 100.0 && fGrade >= 95.0)
      System.out.println("Your grade is: A");
                
    else if (fGrade <= 95.0 && fGrade >= 90.0)
      System.out.println("Your grade is: A-");
                
    else if (fGrade <= 90.0 && fGrade >= 87.0)
      System.out.println("Your grade is: B+");
                
    else if (fGrade <= 87.0 && fGrade >= 83.0)
      System.out.println("Your grade is: B");
                
    else if (fGrade <= 83.0 && fGrade >= 80.0)
      System.out.println("Your grade is: B-");
                
    else if (fGrade <= 80.0 && fGrade >= 77.0)
      System.out.println("Your grade is: C+");
                
    else if (fGrade <= 77.0 && fGrade >= 73.0)
      System.out.println("Your grade is: C");
                
    else if (fGrade <= 73.0 && fGrade >= 70.0)
      System.out.println("Your grade is: C-");
                
    else if (fGrade <= 70.0 && fGrade >= 65.0)
      System.out.println("Your grade is: D+");
                
    else if (fGrade <= 65.0 && fGrade >= 60.0)
      System.out.println("Your grade is: D");
                
    else if (fGrade < 60.0)
      System.out.println("Your grade is: F");
                    
  }
        
}	