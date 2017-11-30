public class Bulb { //create class Bulb
    private boolean on; //declare variable on to be a boolean 
    public Bulb (boolean light) { //declare parameters of Bulb
        on = light; //variable on is equal to light
    }  
    public void On() { //create a method On with no return variable
        on = true; //declare on as true
    } 
    public void Off() { //create a method Off with no return variable
        on = false; //declare on as false
    } 
    public String state() { 
        /* create a method state that returns a string: the state of 
         * the Bulb.
         * This method is not required for the project */
      if(on) { //if on is equal to true, turn then return "On" 
          return "On"; //Simply print "On"
      } else { //otherwise, return "Off"
          return "Off"; //print "Off
      }}}
