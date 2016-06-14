package fizzbuzz;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ResultPrinterTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private ByteArrayOutputStream stderr = new ByteArrayOutputStream();

    private ResultPrinter resultprinter;

    @Before
    public void setup() {
        resultprinter = new ResultPrinter();
        System.setOut(new PrintStream(stdout));
    }

    @Test
    public void print_one_for_one() {
        resultprinter.printSequence(Arrays.asList("1"));
        assertEquals("1" + System.lineSeparator(), stdout.toString());
    }

    @Test
    public void print_one_space_two_space_fizz_for_one_two_fizz() {
        resultprinter.printSequence(Arrays.asList("1", "2", "Fizz"));
        assertEquals("1 2 Fizz" + System.lineSeparator(), stdout.toString());
    }
}
