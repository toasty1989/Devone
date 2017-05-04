/**
 * file: Location.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 6 Chap 10, exercise 17
 * due date: Apr 20, 2017
 * version: 1.8
 *
 * This File contains a code that will find the first ten square numbers
 * that are greater than Long.MAX_VALUE.
 */ 
import java.math.BigInteger;
public class SquareNumber {

  public static void main(String[] args) {
    BigInteger number = new BigInteger("16");
    int count = 1;
    System.out.println("The first ten square numbers" + 
            "that are greater than " + Long.MAX_VALUE + "are: ");
    //Store Long.Max_VALUE in a variable
    BigInteger LongValue = new BigInteger(Long.MAX_VALUE+"");
    //while loop to display first 10 square numbers greater than
    //Long.MAX_VALUE
    while (count <= 10) {
      BigInteger squared = number.multiply(number);
      if (squared.compareTo(LongValue) > 0) {
        System.out.println("Square of " + number + " is "
        + squared + ".");
        count++;
      }
      number = number.add(BigInteger.ONE);
    }
  }
  
}
