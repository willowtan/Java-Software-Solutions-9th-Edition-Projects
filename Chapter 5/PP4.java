import java.util.Scanner;
import java.util.Random;
public class PP4{
    public static void main (String[]args){
       Scanner scan = new Scanner(System.in);
       Random gen = new Random();
       int val  = gen.nextInt(100)+1;
       int guess = 0;
       int count = 0;
       
        while (guess != -1){
            System.out.println ("The number has been choosen. Start guessing until you get the number or max out on guesses. Enter -1 to end.");
            guess = scan.nextInt();
           if (guess > val){
               System.out.println("Guess lower.");
            }
           else if (guess < val){
               System.out.println ("Guess higher."); 
            }
                else if (guess == val){
                    System.out.println ("You got it! That was only in " + (count + 1) + " guesses!");
                    System.out.println ("The next number has been choosen. Enter the first guess or -1 to finish here:");
                    guess = scan.nextInt();
                    val = gen.nextInt((100)+1);
                }          
                System.out.println ("Keep going you can do it! Enter -1 to quit.");
                    guess = scan.nextInt();
           count++;
        }
        System.out.println ("Done? Thanks for playing!"); 
    }}