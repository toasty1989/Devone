/**
 * file: FutureTuitionCompute.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Lab 3 Chap 5, exercise 7
 * due date: Feb 21, 2017
 * version: 1.8
 *
 * This File contains a code that will compute future tuition .
 */
public class FutureTuitionCompute {
  private static final double TUITION = 10000; 
    public static void main(String[] args) {
      //tuition tax inflation
      double tuitionIncrease = 0.05;
      //Tuition in 10 years
      double newTuition = TUITION; 
      //tuition cost after the 10th year
      double fourYear = 0;
      for (int t = 0; t < 10; t++) {
        newTuition *= (1 + tuitionIncrease);   
      }
        fourYear = newTuition;
        System.out.println("Tuition cost in 10 years: $ " + newTuition);
      for (int i = 0; i < 4; i++) {
        fourYear *= (1 + fourYear);
      }
        System.out.println("Total cost of 4 years starting today: $ " + fourYear );           
    }
}
