package fizzbuzz;

import java.util.List;

public class Main {
    
    public static void testFizzBuzz(String[] args) {
        if (args.length != 2) {
            System.err.println("wrong arguments, try: <number> <number>");
            return;
        }
        
        List<String> fizzbuzzsequence = new FizzBuzz().generateFizzBuzzSequence(args[0], args[1]);
        if (fizzbuzzsequence.isEmpty()) {
            System.err.println("wrong arguments, try: <number> <number>");
            return;
        }
        for (int i=0, len=fizzbuzzsequence.size();i<len-1;i++) {
            System.out.print(fizzbuzzsequence.get(i)+" ");
        }
        System.out.print(fizzbuzzsequence.get(fizzbuzzsequence.size()-1)+System.lineSeparator());
    }
    
    public static void main(String... args) {
        testFizzBuzz(args);
    }
}