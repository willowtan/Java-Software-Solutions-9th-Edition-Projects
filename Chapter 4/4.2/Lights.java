public class Lights { //make class Lights
    public static void main(String[]args){ //create a void main
        Bulb bulb1 = new Bulb (true); //make new Bulb object bulb1 set to true
        Bulb bulb2 = new Bulb (false); //make new Bulb object bulb2 set to false
        System.out.println ("Bulb 1: " +bulb1.state()); //print the state of the bulb
        System.out.println ("Bulb 2: " +bulb2.state()); 
        bulb1.Off(); //set the state of the bulb
        bulb2.On(); //set the state of the bulb
        System.out.println ("Bulb 1: " +bulb1.state()); //print the Bulb object's state
        System.out.println ("Bulb 2: " +bulb2.state()); 
    }} 
