package exceptionsTest;

import org.junit.Test;

import exceptions.ExceptionHandling;

import static org.junit.Assert.assertEquals;

public class ExceptionHandlingTest {

    @Test
    public void testConvertStringToInt() {
        assertEquals(23, ExceptionHandling.convertStringToInt("23"));
        assertEquals(0, ExceptionHandling.convertStringToInt("0")); // Additional test case for zero
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertStringToIntWithNonIntegerInput() {
        ExceptionHandling.convertStringToInt("45.67");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertStringToIntWithInvalidInput() {
        ExceptionHandling.convertStringToInt("test");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertStringToIntWithInvalidInput2() {
        ExceptionHandling.convertStringToInt("123f");
    }
}
