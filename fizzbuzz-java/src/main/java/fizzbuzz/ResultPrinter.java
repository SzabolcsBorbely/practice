package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class ResultPrinter {
    private String delimiter = " ";

    public void printSequence(List<String> sequence) {
        String joinedSequence = sequence.stream().map(Object::toString).collect(Collectors.joining(delimiter));
        System.out.println(joinedSequence); //NOSONAR
    }
}
