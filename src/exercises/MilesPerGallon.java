package exercises;

import java.util.Scanner;

class MilesPerGallon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles you have driven?:  ");
        double miles = scan.nextDouble();
        System.out.println("Enter gallons of gas you have consumed?: ");
        double gallons = scan.nextDouble();
        System.out.println("miles per gallon = " + distance(miles, gallons));
    }
    static double distance(double miles, double gallons) {

        return miles/gallons;
    }
}
