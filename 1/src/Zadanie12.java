import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Zadanie12 {

    /*
    Implement a method called pow2 that takes a collection of numbers and returns a collection of squares of these numbers.
    Do not modify elements of the given collection, create a new one and return it as the result instead.
     */

    //1 metoda
    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> result = new ArrayList<>();
        numbers.forEach(number -> result.add((int) Math.pow(number,2)));
        return result;
    }

    //2 metoda
    public static Collection<Integer> pow22(Collection<Integer> numbers) {
        return numbers.stream().map(elem -> elem *= elem)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }
}
