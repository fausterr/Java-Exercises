package Lekcja1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberExample {

    public static void main(String[] args) {

        IntStream stream = IntStream.of(1,2,3,4,5);
        int[] evenNumbers = stream.filter(x -> x%2 ==0).toArray();
        //System.out.println(Arrays.toString(evenNumbers));

        IntStream numStream = IntStream.iterate(0, x -> x + 1);
        IntStream limitedStream = numStream.limit(100);
        int[] numbers = limitedStream.toArray();
        //System.out.println(Arrays.toString(numbers));

        int[] squares = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x*x)
                .filter(x -> x % 2==0)
                .toArray();
        System.out.println(Arrays.toString(squares));
    }
}
