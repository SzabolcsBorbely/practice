package fizzbuzz;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static fizzbuzz.ArgumentParserTest.INVALID_NUMBER_OF_ARGUMENTS;

public class IntegrationTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private ByteArrayOutputStream stderr = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(stdout));
        System.setErr(new PrintStream(stderr));
    }

    @After
    public void teardown() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void prints_fizzbuzz_from_ten_to_sixteen() {
        Main.main("2", "16");
        assertEquals(
                "2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16" + System.lineSeparator(),
                stdout.toString());
        assertEquals("", stderr.toString());
    }

    @Test
    public void prints_error_message_for_wrong_number_of_arguments() {
        Main.main("10");
        assertEquals("", stdout.toString());
        assertEquals("ERROR: "+ INVALID_NUMBER_OF_ARGUMENTS + System.lineSeparator(),
                stderr.toString());
    }
}
