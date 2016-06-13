package fizzbuzz;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void setup() {
        this.fizzbuzz = new FizzBuzz();
    }

    @Test
    public void returns_one_for_one() {
        assertEquals(Arrays.asList("1"), this.fizzbuzz.generateFizzBuzzSequence("1", "1"));
    }

    @Test
    public void returns_two_for_two() {
        assertEquals(Arrays.asList("2"), this.fizzbuzz.generateFizzBuzzSequence("2", "2"));
    }

    @Test
    public void returns_fizz_for_three() {
        assertEquals(Arrays.asList("Fizz"), this.fizzbuzz.generateFizzBuzzSequence("3", "3"));
    }

    @Test
    public void returns_four_for_four() {
        assertEquals(Arrays.asList("4"), this.fizzbuzz.generateFizzBuzzSequence("4", "4"));
    }

    @Test
    public void returns_buzz_for_five() {
        assertEquals(Arrays.asList("Buzz"), this.fizzbuzz.generateFizzBuzzSequence("5", "5"));
    }

    @Test
    public void returns_fizz_for_six() {
        assertEquals(Arrays.asList("Fizz"), this.fizzbuzz.generateFizzBuzzSequence("6", "6"));
    }

    @Test
    public void returns_buzz_for_ten() {
        assertEquals(Arrays.asList("Buzz"), this.fizzbuzz.generateFizzBuzzSequence("10", "10"));
    }

    @Test
    public void returns_fizzbuzz_for_fifteen() {
        assertEquals(Arrays.asList("FizzBuzz"), this.fizzbuzz.generateFizzBuzzSequence("15", "15"));
    }

    @Test
    public void returns_fizz_four_buzz_fizz_seven_for_three_to_seven() {
        assertEquals(Arrays.asList("Fizz", "4", "Buzz", "Fizz", "7"), this.fizzbuzz.generateFizzBuzzSequence("3", "7"));
    }

    @Test
    public void returns_empty_list_for_negative_range() {
        assertEquals(Collections.emptyList(), this.fizzbuzz.generateFizzBuzzSequence("7", "3"));
    }

    @Test
    public void returns_empty_list_for_negative_number_input() {
        assertEquals(Collections.emptyList(), this.fizzbuzz.generateFizzBuzzSequence("-7", "-7"));
    }

    @Test
    public void returns_empty_list_for_not_floating_point_number_input() {
        assertEquals(Collections.emptyList(), this.fizzbuzz.generateFizzBuzzSequence("0.5", "0.5"));
    }

    @Test
    public void return_empty_list_for_character_input() {
        assertEquals(Collections.emptyList(), this.fizzbuzz.generateFizzBuzzSequence("abc", "def"));
    }
}
