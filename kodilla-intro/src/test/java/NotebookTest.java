import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotebookTest {

    @Test
    public void testCheckPriceCheap() {
        Notebook notebook = new Notebook(600, 500, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkPrice();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("This notebook is cheap.", output);
    }

    @Test
    public void testCheckPriceGood() {
        Notebook notebook = new Notebook(800, 800, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkPrice();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("This price is good.", output);
    }

    @Test
    public void testCheckPriceExpensive() {
        Notebook notebook = new Notebook(1200, 2000, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkPrice();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("This notebook is quite expensive.", output);
    }

    @Test
    public void testCheckWeightLight() {
        Notebook notebook = new Notebook(600, 800, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkWeight();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("It is light.", output);
    }

    @Test
    public void testCheckWeightNotTooHeavy() {
        Notebook notebook = new Notebook(900, 800, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkWeight();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("It's not too heavy.", output);
    }

    @Test
    public void testCheckWeightVeryHeavy() {
        Notebook notebook = new Notebook(1400, 800, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkWeight();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("It is very heavy.", output);
    }

    @Test
    public void testCheckYearOld() {
        Notebook notebook = new Notebook(900, 800, 2010);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkYear();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("This laptop is so old.", output);
    }

    @Test
    public void testCheckYearGoodOpportunity() {
        Notebook notebook = new Notebook(900, 1200, 2015);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkYear();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("This is a good opportunity.", output);
    }

    @Test
    public void testCheckYearGamingLaptop() {
        Notebook notebook = new Notebook(900, 800, 2020);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        notebook.checkYear();
        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("It must be a gaming laptop.", output);
    }
}
