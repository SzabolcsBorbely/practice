package fizzbuzz;

public class ArgumentParser {
    public int[] parseArguments(String... inputArgs) {
        if (inputArgs.length != 2) {
            throw new IllegalArgumentException("wrong number of arguments, try: <number> <number>");
        }
        int floor = parseBoundary(inputArgs[0]);
        int top = parseBoundary(inputArgs[1]);
        validateRange(floor, top);
        return new int[] { floor, top };
    }

    private int parseBoundary(String input) {
        try {
            return Integer.parseInt(input);
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
