package lekcja1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {

    public static void main(String[] args) {

        String a = " SIEMANKO ";
        System.out.println(a);
        a = a.toLowerCase().trim();
        System.out.println(a);

        a = " SIEMANKO ";
        System.out.println(a);
        //Function<String, String> func = (String s)  ->s.toLowerCase().trim();
        //Function<String, String> func = text -> text.toLowerCase().trim();

        Function<String, String> func = text -> text.toLowerCase().trim();
        String b = func.apply(a);
        System.out.println(b);
        //*******************************************************************************
        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("abc");
        print3Times.accept("123");
        //*******************************************************************************

        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age>18;
        if(checkIfAdult.test(personAge)) {
            System.out.println("she is legal!");
        }
        //*******************************************************************************

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> people = new ArrayList<>();

        for(int i=0; i<5; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length )];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            Person randomPerson = new Person(firstName, lastName, age);
            people.add(randomPerson);
        }
        for (Person person: people) {
            System.out.println(person);
        }

        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length )];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }

}
