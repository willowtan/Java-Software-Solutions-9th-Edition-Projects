/* Write a class called Dog that contains instance data that represents the dog's
 * name and age.  Define the Dog constructor to accept and initialize instance 
 * data.  Include getter and setter methods for the name and age.  Include a 
 * method to computer and return the age of the dog in "person years" (seven times
 * the dog's age).  Include a toString method that returns a one-line description
 * of the dog.  Create a driver class called kennel, whose main method 
 * instantiates and updates several Dog objects. */

public class Dog { //create class Dog
    private String name; //initialize instance variables
    private int age;
    public Dog(String nm,int ag) { //pass parameters to constructor
        name=nm; age=ag; //declare variables name and age equal to the parameters
        getage(); getname(); humanage(); //declare methods
    }
    public String getname() { //getter for name
        return name;
    }
    public void setname(String nm) { //setter for name
        name=nm;
    }
    public int getage() { //getter for age
        return age;        
    }
    public void setage(int ag) { //setter for age
        age=ag;        
    }
    public int humanage() { //human age computation getter
        return age*7;    
    }
    public String toString() { //toString method that returns some dog info
        return "This dog is named "+name+", and he is a good boy.  He is "+age+" years old and like to eat treats.  In human years he is "+humanage()+"."  ;
    }}
