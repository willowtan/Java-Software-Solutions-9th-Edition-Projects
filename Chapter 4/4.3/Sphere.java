/* Write a class called Sphere that contains instance data that represents
the sphere's diameter.  Define the Sphere contructor to accept and 
initialize the diameter, and include getter and setter methods for the
diameter.  Include methods that calculate and return the volume and surface
area of the sphere (see PP 3.6 for the formulas).  Include a toString method
that returns a one-line description of the sphere.  Create a driver class 
called MultiSphere, whose main method instantiates and updates several Sphere
objects.
*/
//Project 4.3

public class Sphere { //create class Sphere
    private int diameter; //define variables and types
    private double area, volume;
    public Sphere(int diam) { //define parameters for self
        diameter = diam; //initialize variables
        setSVol();
        setSArea();
    }
    public void setSDiameter(int diamter) { //setter for Sphere diameter
        diameter = diamter;
    }
    public int getSDiameter() { //getter 
        return diameter;
    }
    public void setSVol() { //setter for Sphere volume
        volume = Math.PI*(4.0/3.0)* 
        Math.pow((double)diameter/2.0,3);
    }
    public double getSVol() { //getter
        return volume;
    }
       public void setSArea() { //setter for Sphere Area
        area = Math.PI *4.0* 
        Math.pow((double)diameter/2.0,2);
    }
    public double getSArea() { //getter
        return area;
    }
    public String toString() { //the toString class for the Sphere object
        String dmtr = Integer.toString(diameter); //convert variables to string objects 
        String ar = Double.toString(area);
        String vol = Double.toString(volume);
        return "Diameter: "+dmtr+" ||"+"Area: "+ar+" ||"+"Volume: "+vol+" ||"; //print out some stats
    }}