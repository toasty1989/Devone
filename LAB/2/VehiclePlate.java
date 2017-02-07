/**
 * file: VehiclePlate.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 2 Chap 4, exercise 25
 * due date: Feb 03, 2017
 * version: 1.8
 *
 * This File contains a code that will generate a vehicle plate number
 */
public class VehiclePlate {

    public static void main(String[] args) {
        
        //Set a max-min paramenter, generate a number betwe 65-90
        //A-Z code value
        int n1 = 65 + (int)(Math.random() * ((90 - 65) + 1));
        
        int n2 = 65 + (int)(Math.random() * ((90 - 65) + 1));
        
        int n3 = 65 + (int)(Math.random() * ((90 - 65) + 1));
        
	//Generate 3 numbers between 1-9
        int p1 = (int)(Math.random() * 10);
        
        int p2 = (int)(Math.random() * 10);
        
        int p3 = (int)(Math.random() * 10);
        
	//Convert n1, n2, n3 into letters
        char ch1 = (char)n1;
        
        char ch2 = (char)n2;
        
        char ch3 = (char)n3;
        
        System.out.println("Your Liscense plate is: " + ch1 + ch2 + ch3 + p1 + p2 +p3);
    
    }
    
}
