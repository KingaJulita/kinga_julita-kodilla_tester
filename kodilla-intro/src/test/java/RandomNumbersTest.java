import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomNumbersTest {

    @Test
    public void testSumNumberWithEmptyArray() {
        RandomNumbers rn = new RandomNumbers();
        int[] numbers = {}; // Pusta tablica
        int result = rn.sumNumber(numbers);
        assertEquals(0, result);
    }
}

