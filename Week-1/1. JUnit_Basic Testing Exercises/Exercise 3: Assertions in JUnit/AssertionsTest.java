import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void testAssertEquals() {

        int result = 10 + 20;

        assertEquals(30, result);

    }

    @Test
    void testAssertTrue() {

        int age = 20;

        assertTrue(age >= 18);

    }

    @Test
    void testAssertFalse() {

        int age = 15;

        assertFalse(age >= 18);

    }

    @Test
    void testAssertNull() {

        String name = null;

        assertNull(name);

    }

    @Test
    void testAssertNotNull() {

        String name = "Kaviyarasi";

        assertNotNull(name);

    }

    @Test
    void testAssertThrows() {

        assertThrows(ArithmeticException.class, () -> {

            int result = 10 / 0;

        });

    }

}