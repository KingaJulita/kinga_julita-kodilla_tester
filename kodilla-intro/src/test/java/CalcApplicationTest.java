import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcApplicationTest {

    @Test
    public void testPiValue() {
        double expectedPi = 3.1415927;
        assertEquals(expectedPi, Calculator.PI);
    }
}

