package Week6_Tests;
import Week6.MetricCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MetricCalculatorTest {
    @Test
    public void testSimpleAddition() {
        assertEquals(1090, MetricCalculator.calculate("10 cm + 1 m - 10 mm", "mm"));
    }
    @ParameterizedTest
    public void testVariousExpressions(String input, int expected) {
        assertEquals(expected, MetricCalculator.calculate(input));
    }
}
