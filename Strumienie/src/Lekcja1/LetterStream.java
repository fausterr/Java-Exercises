package Lekcja1;

import java.util.Arrays;
import java.util.stream.Stream;

public class LetterStream {

    public static void main(String[] args) {

        Stream<String> letters = Stream.of("a", "b", "c");
        Object[] upperCaseLetters = letters.map(s -> s.toUpperCase())
                .toArray();
        System.out.println(Arrays.toString(upperCaseLetters));

    }
}
