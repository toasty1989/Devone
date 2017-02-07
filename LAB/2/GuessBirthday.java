/**
 * file: GuessBirthday.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 10
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will prompt the user to enter y for yes 
 * and n for no instead of 1 for yes and 2 for no.
 */

import java.util.Scanner;

public class GuessBirthday {

    public static void main(String[] args) {
        
        String set1 = 
                " 1 3 5 7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        
        String set2 = 
                " 2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";
        
        String set3 = 
                " 4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";
        
        String set4 =
                "8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        
        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        
        int day = 0;
        
        //Create a Scanner
        Scanner input = new Scanner(System.in); 
        
        //Prompt the user to answer questions
        System.out.print("Is your Birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter No or Yes: ");
        
	//Convert set1 into a string
	String answer1 = input.nextLine();
        
        //Ask if input contains “Yes”
	if (answer1.contains("Yes"))
            day = 1;
        
        //Prompt the user to answer questions
        System.out.print("Is your Birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter No or Yes: ");
        
	//Convert set2 input into a string 
	String answer2 = input.nextLine();
        
        //Ask if input contains “Yes”
	if (answer2.contains("Yes"))
            day = 2;
        
        //Prompt the user to answer questions
        System.out.print("Is your Birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter No or Yes: ");
        
	//Convert set3 input into a string
	String answer3 = input.nextLine();
        
        //Ask if input contains “Yes”
	if (answer3.contains("Yes"))
            day = 4;
        
        //Prompt the user to answer questions
        System.out.print("Is your Birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter No or Yes: ");
        
	//Convert set4 input into a string
	String answer4 = input.nextLine();
        
        //Ask if input contains “Yes”
	if (answer4.contains("Yes"))
            day = 8;
        
        //Prompt the user to answer questions
        System.out.print("Is your Birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter No or Yes: ");
        
	//Convert set5 input into a string
	String answer5 = input.nextLine();
        
        //Ask if input contains “Yes”
	if (answer5.contains("Yes"))
            day = 16;
        
        System.out.println("\nYour Birthday is " + day + "!");
     
    }
    
}



if (answer.contains("a b c"))
            number = 2;
        
        else if (answer.contains("d D e E f F"))
            number = 3;
        
        else if (answer.contains("g G h H i I"))
            number = 4;
        
        else if (answer.contains("j J k K l L"))
            number = 5;
        
        else if (answer.contains("m M n N o O"))
            number = 6;
        
        else if (answer.contains("p P q Q r R s S"))
            number = 7;
        
        else if (answer.contains("t T u U v V"))
            number = 8;
        
        else if (answer.contains("w W x X y Y z Z"))
            number = 9;