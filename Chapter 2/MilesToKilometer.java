/* Write a program that converts miles to kilometers.  (One mile equals
 * 1.60935 kilometers.)  Read the milesvalue from the user as a floating
 * point value */
//Project 2.6
import java.util.Scanner; //import Scanner
public class MilesToKilometer { //create class MilesToKilometer
    public static void main(String[] args) { //main method
        Scanner scan = new Scanner(System.in); //create scan Scanner objcet
        System.out.print("Enter distance in miles:"); //prompt the user
        double miles = scan.nextDouble(); //read input as a double
        System.out.println(miles + " miles = " + miles*1.60935 + " km");
        //print the conversion
    }}