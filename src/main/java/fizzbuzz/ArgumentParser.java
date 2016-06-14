package fizzbuzz;

public class ArgumentParser {
    public int[] parseArguments(String... input_args) {
        if (input_args.length != 2) {
            throw new IllegalArgumentException("wrong number of arguments, try: <number> <number>");
        }
        int floor = parseBoundary(input_args[0]);
        int top = parseBoundary(input_args[1]);
        validateRange(floor, top);
        return new int[] { floor, top };
    }

    private int parseBoundary(String input) {
        try {
            int boundary = Integer.parseInt(input);
            return boundary;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("wrong arguments, The range boundaries have to be integers");
        }
    }

    private void validateRange(int floor, int top) {
        if (floor <= 0 || top <= 0) {
            throw new IllegalArgumentException("wrong arguments, The range boundaries have to be greater than 0");
        }
        if (top < floor) {
            throw new IllegalArgumentException("wrong arguments, Range floor is smaller than range top.");
        }
    }
}
