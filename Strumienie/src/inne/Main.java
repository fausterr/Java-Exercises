package inne;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream stream = IntStream.of(1,2,3,4);
        //stream.filter(x -> x % 2 == 0);
        int[] ints = stream.filter(x -> x % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(ints));


        Stream<String>  letters = Stream.of("a", "b", "c");
        Object[] upp = letters.map(s -> s.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upp));


        IntStream numStr = IntStream.iterate(0, x -> x + 1);
        IntStream limit = numStr.limit(100);
        int[] numbers = limit.toArray();
        System.out.println(Arrays.toString(numbers));

        double a = 4.0;
        double b = 3.0;
        System.out.println(Double.compare(a, b));


    }
}
