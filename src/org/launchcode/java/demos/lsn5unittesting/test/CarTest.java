package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Honda", "CRV", 12, 30);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    // (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001); // delta allowed difference btwn expected and actual - required when comparing doubles
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        Car test_car = new Car ("Honda", "CRV",12,30);
        assertEquals(12, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(10, test_car.getGasTankLevel(), .35);
    }

        //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        //you'll need to simulate the Car travelling farther than it's gasTankLevel allows
        //what is farther than the gasTankLevel allows - gasTankSize and milesPerGallon
        //Total miles = miles per gallon * tank size  (360 miles we can travel)
        //expected odometer is 360 when tank is empty
        test_car.drive(420);
        assertEquals(360, test_car.getOdometer(), .35);
    }
        //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
//AssertionError means that what we expected from the test is not being provided
       test_car.addGas(5);
           fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
        }
    }


