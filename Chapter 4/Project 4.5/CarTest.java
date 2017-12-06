public class CarTest { 
    public static void main(String[]args) {
        Car car1= new Car("Volvo","S90",2014); //Create Car objects
        Car car2= new Car("Mercedes-Benz","S60",2006);
        System.out.println(car1.isAntique()); //print if they're antique
        System.out.println(car2.isAntique());
        car1.setYear(2016); //change some things
        car2.setMake("Volvo");
        System.out.println(car1); //call toString to print some info
        System.out.println(car2);
    }}
