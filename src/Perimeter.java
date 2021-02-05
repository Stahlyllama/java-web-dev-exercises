
import java.util.Scanner;


class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius? : ");
        double in = input.nextDouble();
        double perimeter = ((2 * Math.PI) * in);
        System.out.println("perimeter is: " + perimeter);
    }
}
