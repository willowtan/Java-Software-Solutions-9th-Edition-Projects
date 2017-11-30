/*Write a program that prompts for and reads a person's name,
  age, college, and pet's name.  Then print the following paragraph,
  inserting the appropriate data:
  Hello, my name is *name* and I am *age* years old.  I'm enjoying my 
  time at *college*, though I miss my pet *petnname* very much!
 */
//Project 2.4

import java.util.Scanner; //import Scanner object
public class Contact{ //create class Contact
    public static void main(String [] args){ //make main void method
        Scanner scan=new Scanner (System.in); //make new Scanner object Scanner
        String name, age, college, petname; // declare variables as string
        System.out.println("What is your name:"); //Prints out a prompt
        name=scan.nextLine(); //reads input and stores to variable
        System.out.println("How old are you?: "); 
        age=scan.nextLine();
        System.out.println("Where do you want to go to college: ");
        college=scan.nextLine();
        System.out.println("What is your petname:");
        petname=scan.nextLine();
        System.out.println("Hello, my name is "+name+" and I am "+age+" years old.  I'm my time at  "+college+", though I miss my pet "+petname+" very much!");
        //Prints out final paragraph with the inputted variables
}}
