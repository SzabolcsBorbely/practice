package fizzbuzz;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    static final String FIZZ_BUZZ = "FizzBuzz";

    public List<String> generateFizzBuzzSequence(int rangeFloor, int rangeTop) {
        List<String> resultList = new ArrayList<>();
        boolean divisibleByThree;
        boolean divisibleByFive;

        for (int i = rangeFloor; i <= rangeTop; i++) {
            divisibleByThree = i % 3 == 0;
            divisibleByFive = i % 5 == 0;

            if (divisibleByThree && divisibleByFive) {
                resultList.add(FIZZ_BUZZ);
            } else if (divisibleByThree) {
                resultList.add(FIZZ);
            } else if (divisibleByFive) {
                resultList.add(BUZZ);
            } else {
                resultList.add(Integer.toString(i));
            }
        }
        return resultList;
    }
}
