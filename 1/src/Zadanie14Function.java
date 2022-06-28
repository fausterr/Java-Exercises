import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Zadanie14Function {
/*
Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
The order of elements in the result list may be any (elements will be sorted by the testing system).
If the input list doesn't contain any strings then the result list should be empty.
Hints: it is possible to use sets, maps, lists and so on for helping.
 */

    //1
    public static UnaryOperator<List<String>> unaryOperator = x -> new ArrayList<>(new HashSet<>(x));

    //2
    public static UnaryOperator<List<String>> unaryOperator2 =
            x -> x.stream().distinct().collect(Collectors.toList());

    //3
}
