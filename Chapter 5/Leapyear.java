import java.util.Scanner;
public class Leapyear {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        boolean leapyear;
        System.out.print("Enter a year: ");
        int year= scan.nextInt();
        if ((year%400==0)||(year%4==0 && year%100!=0)&&year>1582)
             System.out.println("This is a leap year.");
        else
            System.out.println("This is not a leap year.");
    }}
