package Lekcja2prim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MetodaSupplier {

    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(firstNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        List<Person> people = new ArrayList<>();
        for(int i=0; i<5; i++) {
            people.add(supplier.get());
        }
        consumeList(people, p -> System.out.println(p));

        List<Person> people2 = generateRandomList(5, () ->{
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(firstNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        });



    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for(int i=0; i<elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for(T t: list) {
            consumer.accept(t);
        }
    }
}
