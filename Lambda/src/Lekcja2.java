import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavastartLekcja2 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));
        System.out.println(">>>People");
        consumeList(people, p -> System.out.println(p));
        System.out.println(">>>People age+1");
        consumeList(people, p -> p.setAge(p.getAge()+1));
        consumeList(people, p -> System.out.println(p));
        //****************************************************************************

        List<Person> adults = filterByPredicate(people, p -> p.getAge()>=18);
        consumeList(adults, a -> System.out.println(a));
        List<Person> janPeople = filterByPredicate(people, p -> p.getFirstName().equals("Jan"));
        consumeList(janPeople, jan -> System.out.println(jan));
        //****************************************************************************

        List<String> firstNames = converList(people, p -> p.getFirstName());
        System.out.println("lista imion:");
        consumeList(firstNames, name -> System.out.println(name));
        System.out.println("lista lat:");
        List<Integer> ages = converList(people, p -> p.getAge());
        consumeList(ages, age -> System.out.println(age));
        //****************************************************************************

        String[] firstNames2 = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames2 = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages2 = {22, 33, 44, 55};
        Random random = new Random();
        //****************************************************************************

//        List<Person> people2 = generateRandomList(5, () -> {
//            String firstName = firstNames2[random.nextInt(firstNames2.length)];
//            String lastName = lastNames2[random.nextInt(lastNames2.length)];
//            int age = ages2[random.nextInt(ages2.length)];
//            return new Person(firstName, lastName, age);
//        }); pierwszy sposob

        Supplier<Person> supplier =  () -> {
            String firstName = firstNames2[random.nextInt(firstNames2.length)];
            String lastName = lastNames2[random.nextInt(lastNames2.length)];
            int age = ages2[random.nextInt(ages2.length)];
            return new Person(firstName, lastName, age);
        };
        List<Person> newPersons = generateRandomList(5, supplier);
        consumeList(newPersons, p -> System.out.println(p));

    }
    public static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for(T t: list) {
            consumer.accept(t);
        }
    }

    public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T t: list) {
            if(predicate.test(t))
                result.add(t);
        }
        return result;
    }

    private static <T, R> List<R> converList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for(T t: list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for(int i=0; i<elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
