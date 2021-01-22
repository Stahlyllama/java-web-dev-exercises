package safespace;


import org.launchcode.java.demos.Hello;

import java.util.Scanner;

public class HelloWorld {

    // Class Variables
    public String message = "Hello World";

    // Methods
    public void sayHello(String thisIsAParam) {

        String message = "Goodbye World";

        // When passed INTO a method its an arguement
        System.out.println(message);

        System.out.println(this.message);
    }

    public void yourNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        String number = input.nextLine();
        System.out.println("Here's your number: " + number);
    }
}



