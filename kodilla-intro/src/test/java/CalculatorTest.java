import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        assertEquals(8.0, result);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double result = calculator.sub(5, 3);
        assertEquals(2.0, result);
    }


    @Test
    public void testCirclePerimeter() {
        Calculator calculator = new Calculator();
        double radius = 10;
        double expectedPerimeter = 2 * Calculator.PI * radius;
        double actualPerimeter = calculator.circlePerimeter(radius);

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void testPiValue() {
        double expectedPi = 3.1415927;
        assertEquals(expectedPi, Calculator.PI);
    }
}
