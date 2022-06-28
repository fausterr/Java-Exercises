package inne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestApp2 {

    public static void main(String[] args) {

        String a = "";
        Consumer<String> print9Times = s -> {
            print3Times(s);
            print3Times(s);
            print3Times(s);
        };
       // print9Times.accept("Hello");
        Predicate<Integer> checkAdult = age -> age>=18;
        boolean c = checkAdult.test(12);
        //System.out.println(c);

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> people = new ArrayList<>();
        Supplier<Person> ludziki = () ->{
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        //ludziki.get();
        System.out.println(ludziki.get());
    }

    static boolean check(int age) {
        return age>=18;
    }

    private static void print3Times(String abc) {
        System.out.println(abc);
        System.out.println(abc);
        System.out.println(abc);
    }
}
