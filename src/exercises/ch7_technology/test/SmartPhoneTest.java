package exercises.ch7_technology.test;

import exercises.ch7_technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SmartPhoneTest {

    SmartPhone mySmartPhone;

    @Before
    public void beforeTests() {
        mySmartPhone = new SmartPhone(1504, 500, "1980", true);

    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(1504, this.mySmartPhone.getScreenWidth());
        assertEquals(500, this.mySmartPhone.getScreenHeight());
        assertEquals("1980", this.mySmartPhone.getManufacturerDate());
        assertEquals(true, this.mySmartPhone.getIsConnectedTo5G());
    }
}