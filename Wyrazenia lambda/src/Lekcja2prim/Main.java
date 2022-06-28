package Lekcja2prim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        //consumeList(people, p -> p.setAge(p.getAge() + 1));
        //consumeList(people, p -> System.out.println(p.getLastName()));

        filterByPredicate(people, p -> p.getAge() >= 18);

        convertList(people, person -> person.getFirstName());
        convertList(people, person -> person.getAge()); //mapowanie z typu person na int



    }

    private static <T,R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for(T t: list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return  resultList;
    }

    private static List<String> getFirstName(List<Person> people) {
        List<String> firstNames = new ArrayList<>();
        for(Person p: people) {
            firstNames.add(p.getFirstName());
        }
        return firstNames;
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }


    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}

//    private static void printList(List<Person> people) {
//        for (Person person : people) {
//            System.out.println(person.getAge());
//        }
//    }

