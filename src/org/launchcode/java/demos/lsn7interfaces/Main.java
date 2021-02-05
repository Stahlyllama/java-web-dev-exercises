/*package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        System.out.println("Before:");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);

       System.out.println("*******");

        flavors.sort( new FlavorComparator());
        System.out.println("After:");
            for(Flavor flavor : flavors){
                System.out.println(flavor.getName());
            }
        System.out.println("*******");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("Before:");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        System.out.println("*******");

        cones.sort ( new ConeComparator());
        System.out.println("After:");
            for (Cone cone : cones){
                System.out.println(cone.getName() + ": $" + cone.getCost());
            }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Before:");
        for (Topping topping : toppings){
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }
        System.out.println("*******");

        System.out.println("After:");
        for (Topping topping : toppings){
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }
        System.out.println("*******");
        }

    }
}
*/