package fizzbuzz;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class FizzBuzz {
    
    final String FIZZ = "Fizz";
    final String BUZZ = "Buzz";
    final String FIZZBUZZ = "FizzBuzz";
    
    public List<String> generateFizzBuzzSequence(String range_floor, String range_top) {
        if (rangeIsValid(range_floor, range_top)) {
            int floor = Integer.parseInt(range_floor);
            int top = Integer.parseInt(range_top);
            return generateSequence(floor, top);
        }
        return Collections.emptyList();
    }

    public boolean rangeIsValid(String range_floor, String range_top) {
        try {
            int floor = Integer.parseInt(range_floor);
            int top = Integer.parseInt(range_top);
            if (floor <= 0 || top <= 0)
                return false;
            if (top < floor)
                return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public List<String> generateSequence(int range_floor, int range_top) {
        List<String> result_list = new ArrayList<String>();
        boolean divisible_by_3, divisible_by_5;

        for (int i = range_floor; i <= range_top; i++) {
            divisible_by_3 = i % 3 == 0;
            divisible_by_5 = i % 5 == 0;

            if (divisible_by_3 && divisible_by_5) {
                result_list.add(FIZZBUZZ);
            } else if (divisible_by_3) {
                result_list.add(FIZZ);
            } else if (divisible_by_5) {
                result_list.add(BUZZ);
            } else {
                result_list.add(new Integer(i).toString());
            }
        }
        return result_list;
    }
}
