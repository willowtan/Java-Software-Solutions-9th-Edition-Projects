/* Create a version of the previous project that reverses the computation. 
 * That is, read a value representing a number of seconds, then print the 
 * equivalent amount of time as a combination of hours, minutes, and seconds.  
 * (For example, 9999 seconds is equivalent to 2 hours, 46 minutes, and 39 seconds.)
 */
//Project 2.9

import java.util.Scanner;
public class SecondsinTime {
    public static void Time(String[]args) {
        int hours; int minutes; int seconds; int remainder; int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Seconds (Integer): ");
        input = scan.nextInt();
        hours = input / 3600; remainder = input % 3600;
        minutes = remainder / 60;
        seconds = remainder % 60;
        System.out.println( hours + " hour(s), " + minutes + " minute(s), " + seconds + " seconds");  
    }}