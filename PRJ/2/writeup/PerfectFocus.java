/**
 * file: Location.java
 * author: Manfred Cabintoy
 * course: CMPT 220
 * assignment: Project 2
 * due date: Apr 15, 2017
 * version: 1.8
 *
 * This File contains a code that will give you the total depth of field.
 * Hyperfocal length, nearDistance, farDistance must be calculated first
 * before a total Depth of field can be calculated.
 */ 
import java.util.Scanner;
public class PerfectFocus {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double focalLength = 0; //default value for focalLength until user input
    double aperture = 0; //default value for focalLength until user input
    double distance = 0; //default value for focalLength until user input
    double circleOfConfusion = 0; //default value for focalLength until user input
    //converted CircleOfConfusion
    
    
    System.out.println("Choose 1 or 2 : \n 1) APS/APS-C sized sensor"
            + "\n 2) 35mm film camera. ");
    while(true) {
        circleOfConfusion = input.nextDouble(); 
        if(circleOfConfusion < 1.0 || circleOfConfusion > 2.0){
          System.out.println("Invalid input, please try again.");
        }
        else if (circleOfConfusion == 1){
          circleOfConfusion = .019948;
          break;
        }
        else if (circleOfConfusion == 2){
          circleOfConfusion = .02501;
          break;
        }
    }  
    
    //double tempCircleOfConfusion = input.nextDouble();
    //double circleOfConfusion = circleOf(tempCircleOfConfusion);
    
    //Focal Length of the current lens being used
    //Current ranges of lens length are: 8mm-2000mm respectively 
    System.out.println("What is the current focal length of your lens(mm): ");
    while(true) {
        focalLength = input.nextDouble(); 
        if(focalLength < 8.0 || focalLength > 2000.0){
          System.out.println("Invalid input, please try again.");
        }
        else {
          break;
        }
    }
      
    //Aprroximate Focus distance of the subject you want in focus
    System.out.println("How far is the subject you want in focus(ft)?: ");  
    
    while(true) {
        distance = input.nextDouble(); 
        if(distance < 0.1){
          System.out.println("Invalid input, please try again.");
        }
        else {
          distance = distance * 304.80; //304.80 mm = 1 ft 
          break;
        }
    }
    
    //F-Stop setting on the camera
    //curent ranges are 1.4 - 22
    System.out.println("From a range of 1.0 - 22, " 
            + "what is your current f/stop?: ");
    while(true) {
        aperture = input.nextDouble(); 
        if(aperture < 1.0 || aperture > 22.0){
          System.out.println("Invalid input, please try again.");
        }
        else {
          break;
        }
    }
    
    //Formula to find the hyperFocal distance 
    double hyperFocal = hyperFocalDistance(focalLength,aperture, 
            circleOfConfusion);
    
    //Closest distance that will be in focus 
    double nearDistance = nearDistance(hyperFocal, distance, focalLength);
    
    //Beyond the distance of nearDistance and before the subject
    double farDistance = farDistance(hyperFocal, distance, focalLength);
    
    //Total depth of field calculates the total amount of focal distance
    double totalDOF = farDistance - nearDistance;
    
    //Hyperfocal Distance will be the distance between near and far distance 
    //required for the Perfect Focus
    System.out.printf("The hyperfocal distance is: %2.2f feet \n", 
            hyperFocal / 304.80);
    
    //Display the near distance needed to be in focus
    System.out.printf("The nearest distance your subject must be: %2.2f"
            + " feet \n", nearDistance / 304.80);
    
    //Display the far distance needed to be in focus
    System.out.printf("The furthest distance your subject must be: %2.2f"
            + " feet\n", farDistance / 304.80 );
    
    //Calculate total Depth of field
    System.out.printf("Actual distance of focus is: %2.2f"
            + " feet \n", totalDOF / 304.80);
  }
  //Method is to calculate the Hyper Focal Distance of a subject
  //Furthest point an image will be in focus
  //Equation is : 
  //(focallength * focallength) / (aperture * circleofconfusion)
  public static double hyperFocalDistance(double f, double a, double c) {
    
    double h = ((f * f) / (a*c));
    return h;
  }
  
  
  //Method to calculate the near distance of acceptable sharpness
  // Equation for farDistance is: 
  // (hyperfocal * distance) / (hyperfocal + (distance - focal))
  public static double nearDistance(double h, double d, 
          double f) {
    
    double distanceNear = (h * d) / (h + (d - f));
    return distanceNear;
  }
  
  //The method is to calculate the far distance of acceptable sharpness
  // (hyperfocal * distance) / (hyperfocal - (distance - focal))
     
  public static double farDistance(double h, double d,
          double f) {
    double distanceFar = (h * d) / (h - (d - f));
    return distanceFar;
  }
  // Equation for DOF is: FarPoint - NearPoint
  // DOF is the the depth length of you which you will have maximum focus
  public static double dOF(double f, double n) {
    double dOF = f - n;
    return dOF;
  }
}
