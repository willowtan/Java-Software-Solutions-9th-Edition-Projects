/* Create a version of the TempConverter application to convert from
   Farenheit to Celsius.  Read the Farenheit temperature from the
   user. */
// Project 2.5

import java.util.Scanner;
class Convert { 
    public static void Temp(String[]args) { 
        Scanner scan=new Scanner(System.in);
        float faren, celcius;
        System.out.printlns("Enter a value in Fahrenheit");
        faren=scan.nextInt(); 
        celcius=((faren - 32)*5)/9; 
        System.out.println("Celsius = " + celcius); 
}}
