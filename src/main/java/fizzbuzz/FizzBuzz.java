package fizzbuzz;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    static final String FIZZBUZZ = "FizzBuzz";

    public List<String> generateFizzBuzzSequence(int range_floor, int range_top) {
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
