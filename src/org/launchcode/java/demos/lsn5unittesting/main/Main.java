package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Honda", "CRV", 12, 30);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}
