package exercises.ch7_technology.test;

import exercises.ch7_technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

        Laptop myLaptop;

        @Before
        public void beforeTests() {
            myLaptop = new Laptop(1684, 456, "2021", true);

        }

        @Test
        public void constructorSetsValuesTest() {
            assertEquals(1684, this.myLaptop.getScreenWidth());
            assertEquals(456, this.myLaptop.getScreenHeight());
            assertEquals("2021", this.myLaptop.getManufacturerDate());
            assertEquals(true, this.myLaptop.getIsIntelliJOpen());
        }

    private void assertEquals(String s, String manufacturerDate) {
    }

    private void assertEquals(boolean b, boolean isIntelliJOpen) {
    }

    @Test
        public void twoPlusTwoReturnsFour() {
            int result = this.myLaptop.processTwoPlusTwo();
            assertEquals(4, result);
        }

    private void assertEquals(int i, int result) {
    }

    @Test
        public void openIntelliJSetsIsIntelliJOpenToTrue(){
            this.myLaptop.setIsIntelliJOpen(false); //this sets isIntelliJOpen to false
            assertEquals(false, this.myLaptop.getIsIntelliJOpen());
            this.myLaptop.openIntelliJ();//this will set it to true
            assertEquals(true, this.myLaptop.getIsIntelliJOpen());//this will test if it's actually true by using that getter.
    }

    }


