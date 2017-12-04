public class Kennel { //create driver class kennel
    public static void main(String[]args) { //main method
        Dog dog1=new Dog("doggo_1",3); //make a new Dog object with a name and age
        Dog dog2=new Dog("MoonMoon",4);
        Dog dog3=new Dog("Fluffer",2);
        dog1.setname("Doge"); //call setname() to change dog1's name 
        dog3.setage(5); //call setage() to dog3 and change age to 5
        System.out.println(dog1); //calls toString method to print info
        System.out.println(dog2);
        System.out.println(dog3);
    }}
