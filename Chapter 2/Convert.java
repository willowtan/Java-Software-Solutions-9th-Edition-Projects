/* Create a version of the TempConverter application to convert from
   Farenheit to Celsius.  Read the Farenheit temperature from the
   user.
 */
// Project 2.5

import java.util.Scanner; //import Scanner
class Convert { //create class Convert
    public static void Temp(String[] args) { //main method
        Scanner scan=new Scanner(System.in); //create Scanner object
        float faren, celcius; //create variable faren and celcius as float
        System.out.println("Enter a value in Fahrenheit"); //prompt user
        faren=scan.nextInt(); //read input and store to variable faren
        celcius=((faren - 32)*5)/9; //apply a formula to faren, and store it to celcius
        System.out.println("Celsius = " + celcius); //print out the final conversion
    }}
