package fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgumentParserTest {
    static final String INVALID_NUMBER_OF_ARGUMENTS = "wrong number of arguments, try: <number> <number>";
    static final String NEGATIVE_RANGE = "wrong arguments, Range floor is smaller than range top.";
    static final String NEGATIVE_ARGUMENTS = "wrong arguments, The range boundaries have to be greater than 0";
    static final String NOT_INTEGER_ARGUMENTS = "wrong arguments, The range boundaries have to be integers";

    private ArgumentParser argumentparser;

    @Before
    public void setup() {
        argumentparser = new ArgumentParser();
    }

    @Test
    public void throws_exception_for_invalid_number_of_arguments() {
        try {
            argumentparser.parseArguments("10");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is(INVALID_NUMBER_OF_ARGUMENTS));
        }
    }

    @Test
    public void throws_exception_for_negative_range() {
        try {
            argumentparser.parseArguments("7", "3");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is(NEGATIVE_RANGE));
        }
    }

    @Test
    public void throws_exception_for_negative_number_input() {
        try {
            argumentparser.parseArguments("-7", "-7");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is(NEGATIVE_ARGUMENTS));
        }
    }

    @Test
    public void throws_exception_for_not_floating_point_number_input() {
        try {
            argumentparser.parseArguments("0.5", "0.5");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is(NOT_INTEGER_ARGUMENTS));
        }
    }

    @Test
    public void throws_exception_for_character_input() {
        try {
            argumentparser.parseArguments("abc", "def");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is(NOT_INTEGER_ARGUMENTS));
        }
    }
}
