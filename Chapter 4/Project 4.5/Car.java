/* Write a class called Car that contains instance data that 
 * represents the make, model, and year of the car. Define the Car
 * constructor to initialize these values. Include getter and 
 * setter methods for all instance data, and a toString method 
 * that returns a one-line description of the car. Add a method 
 * called isAntique that returns a boolean indicating if the car 
 * is an antique (if it is more than 45 years old). Create a 
 * driver class called CarTest, whose main method instantiates and
 * updates several Car objects. */
 //Project 4.5

public class Car { //Create a Car class
    private int year; //make instance variables
    private String make, model;
    private int current= 2017 ;
    public Car(String mk,String mdl,int yr) { //Car constructor, allow parameters
        make= mk; model= mdl; year= yr; //set varibable according to parameters
        getYear(); getMake(); getModel(); isAntique();
    } 
    public String getMake(){ //getter for make
        return make;
    }
    public void setMake(String mk){ //setter
        make= mk;
    }
    public String getModel(){ //getter for model
        return model;
    }
    public void setModel(String mdl){  //setter for model
        model= mdl;
    }
    public int getYear(){ //getter for year
        return year;
    }
    public void setYear(int yr) { //setter for year
        yr= year;        
    }
    public Boolean isAntique() { //tests if the car is older than 44 years 
        return ((current-year)>=45);
    }
    public String toString() { //returns some fancy info
        return "This car is a "+make+" "+model+" and is "+(2017-year)+" years old.";
    }}
