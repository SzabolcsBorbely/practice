package fizzbuzz;

import java.util.List;

public class Main {
    public static void main(String... args) {
        try {
            int[] range = new ArgumentParser().parseArguments(args);
            List<String> fizzbuzzsequence = new FizzBuzz().generateFizzBuzzSequence(range[0], range[1]);
            new ResultPrinter().printSequence(fizzbuzzsequence);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
