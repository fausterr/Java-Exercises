package lekcja2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));
        System.out.println("************original: ");
//        printList(people);
//        for(Person person: people) {
//            person.setAge(person.getAge() + 1);
//        }
//        System.out.println("************age + 1: ");
//        printList(people);
        System.out.println(">>>people");
        consumeList(people, p -> System.out.println(p));
        System.out.println(">>>people age+1");
        consumeList(people, p -> p.setAge(p.getAge() + 1));
        consumeList(people, p -> System.out.println(p));
        //***********************************************************************************

        System.out.println(">>> Adults");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >=18);
        consumeList(adults, p -> System.out.println(p));
        System.out.println(">>> Jan People");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
        consumeList(janPeople, p -> System.out.println(p));

    }

    private static void printList(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for(T t: list) {
            consumer.accept(t);
        }
    }

    private static List<Person> filterAdults(List<Person> people) {
        List<Person> adults = new ArrayList<>();
        for(Person p: people) {
            if(p.getAge() >= 18) {
                adults.add(p);
            }
        }
        return  adults;
    }

    private static List<Person> filterJanPeople(List<Person> people) {
        List<Person> janPeople = new ArrayList<>();
        for(Person p: people) {
            if("Jan".equals(p.getFirstName())) {
                janPeople.add(p);
            }
        }
        return janPeople;
    }

    private static <T> List <T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T t: list) {
            if(predicate.test(t))
                result.add(t);
        }
        return result;
    }
}