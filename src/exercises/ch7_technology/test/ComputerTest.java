package exercises.ch7_technology.test;

import exercises.ch7_technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComputerTest {

    Computer myComputer;

    @Before
    public void beforeTests() {
        myComputer = new Computer(3000, 900, "2021");

    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(900, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufacturerDate());
    }

    @Test
    public void twoPlusTwoReturnsFour() {
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);
    }
}
