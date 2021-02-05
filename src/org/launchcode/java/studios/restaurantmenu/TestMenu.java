//package org.launchcode.java.studios.restaurantmenu;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//public class TestMenu {
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//public class Homework4 {
//    public static void main(String[] args) {
//        //setup Scanner input= new Scanner(System.in);
//        DecimalFormat df = new DecimalFormat("0.00");
//        double subTotal = 0;
//        double total = 0;
//        int Selection = 0;
//        int cevicheCount = 0;
//        int soupCount = 0;
//        int steakCount = 0;
//        int beerCount = 0;
//        int wineCount = 0;
//        double ceviche = 9.45;
//        double soup = 7.95;
//        double steak = 19.95;
//        double beer = 3.95;
//        double wine = 3.95;
//        int itemsNumber = 0;
//        double tax = 0;
//        double taxes = 0.10;
//        double totalFinal = 0;
//        do {
//            // input System.out.println("Welcome to Mixtura");
//
//            System.out.println(" 1) Ceviche $" + ceviche);
//            System.out.println(" 2) Chichen Soup $" + soup);
//            System.out.println(" 3) Steak with fries $" + steak);
//            System.out.println(" 4) Beer $" + beer);
//            System.out.println(" 5) Wine $" + wine);
//
//            if (Selection != 0) {
//                System.out.println(" 0) Finish Order");
//            }
//            System.out.println("Current Subtotal $" + (df.format(total)));
//            System.out.print("Please make your selection: ");
//            Scanner input;
//            Selection = input.nextInt();
//            // computation
//            if (Selection > 5 || Selection < 0) {
//                System.out.println("No such a choice. Please enter a different choice");
//            } else if (Selection == 1)
//                subTotal = ceviche;
//            ++cevicheCount;
//            ++itemsNumber;
//            total = total + subTotal;
//        }
//        if (Selection == 2) {
//            subTotal = soup;
//            ++soupCount;
//            ++itemsNumber;
//            total = total + subTotal;
//        }
//        if (Selection == 3) {
//            subTotal = steak;
//
//        }
//    }