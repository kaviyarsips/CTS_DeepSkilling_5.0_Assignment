import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testMockingAndStubbing() {

        CalculatorService mockService = mock(CalculatorService.class);

        when(mockService.add(10, 20)).thenReturn(30);

        Calculator calculator = new Calculator(mockService);

        int result = calculator.performAddition(10, 20);

        assertEquals(30, result);
    }
}