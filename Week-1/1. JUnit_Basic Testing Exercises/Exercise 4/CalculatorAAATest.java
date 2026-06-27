import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorAAATest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}