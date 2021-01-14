package org.launchcode.java.studios.areaofacircle;
// This task 3 things:
//1. ask user for radius
//2. calculate the area
//3. print the result to the screen

import java.util.Scanner;

public class Area {
                //main method is starting point for our Java application
    public static void main(String[] args) { // inside curly brackets we place what we want to run here
                //we want the method calculate area with the Area class to run;
                // if we want a method within a class to run we need to create a new instance of that class
                //and b/c you're in the main and static
        Area area = new Area();
        area.calculateArea();
    }
                //declare class variables here

    public Area() {    //create Constructors here
    }

    public void calculateArea(){    //create other methods here
                //ask for the radius
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while(keepOnLooping) {
                Double myUsersRadius = input.nextDouble(); //input.nextDouble is the users input set to the myUsersRadius variable
                //calculate the area  Area = pi * radius * radius
                //checks if the input is a negative
                if (myUsersRadius < 0) {
                    System.out.println("You can't enter a negative number!");//print an error to the user
                } else {    //continue as normal
                    Double area = Circle.getArea(myUsersRadius);  //changed b/c circle.getArea is now doing calculation and we pass the
                    //variable storing radius which is myUsersRadius as a parameter into the method
                    //print the result
                    System.out.println(area);

                    //tell the while loop to exit
                    keepOnLooping = false;
                }
            }
        } catch(Exception error) {
            System.out.println("You must provide numeric input");
        }
                //close the scanner
        input.close();
    }
}


/*
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the radius: ");
         double radius = input.nextDouble(){

         if {
             double radius !=radius isNaN;
             System.out.println("Enter a integer value for radius: "_);

         }else if {
             double radius <=0;
             System.out.println("Enter a valid postiive value for radius: ");

         }else{
             double area = Circle.getArea( double radius);
             System.out.println("The area of circle is: " + area);
         }
     }
     }
 }
*/





