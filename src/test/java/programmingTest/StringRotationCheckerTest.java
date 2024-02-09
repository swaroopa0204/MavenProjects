package programmingTest;

import org.junit.Test;
import programming.StringRotationChecker;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotation() {
        assertTrue(StringRotationChecker.isRotation("abcde", "cdeab")); // Rotated version of "abcde"
        assertTrue(StringRotationChecker.isRotation("waterbottle", "erbottlewat")); // Rotated version of "waterbottle"
        assertFalse(StringRotationChecker.isRotation("hello", "world")); // Not a rotation
    }
}
