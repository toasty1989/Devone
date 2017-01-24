/**
   * file: grade.java
   * author: Manfred Cabintoy
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jan 24, 2017
   * version: 1.8
   * 
   * This File contain a code that reads the sum of his grades to 
     compute the final grade.
   */


import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter midterm grade
		System.out.print("Enter midterm exam grade: ");
		double mterm = input.nextDouble();
		//Prompt user to enter final exam grade
		System.out.print("Enter final exam grade: ");
		double fexam = input.nextDouble();
		//Prompt the user to enter projects grade
		System.out.print("Enter projects grade: ");
		double projects = input.nextDouble();
		//Promt the user to enter homework and lab grades
		System.out.print("Enter homework and lab grades: ");
		double hlgrades = input.nextDouble();
		//The sum of all grade / 4
		double fgrade = (mterm + fexam + projects + hlgrades) / 4;
		System.out.println("Your final grade is: " + fgrade + "%");
	}
}	