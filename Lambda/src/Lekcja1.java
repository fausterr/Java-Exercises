import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavastartLekcja1 {

    public static void main(String[] args) {

        String original = " WIELKI NAPIS ";
        //Function<String, String> function = (String s) -> s.toLowerCase().trim();
        Function<String, String> function = s -> s.toLowerCase().trim(); //to samo co wyzej bez nawiasow
        String lowerCaseTrim = function.apply(original);
        System.out.println(lowerCaseTrim);
        //************************************************************************

        Consumer<String> printer = s -> {
            for(int i=0; i<3; i++) {
                System.out.println(s);
            }
            //zamiast petli mozna po kolei
        };
        printer.accept("cześć");
        //************************************************************************

        Predicate<Integer> checkIfAdult = age -> age>=18;
        int myAge = 13;
        //boolean check = checkIfAdult.test(myAge);
        //System.out.println(check);
        if(checkIfAdult.test(myAge)) {
            System.out.println("pełnoletni");
        } else {
            System.out.println("nie ma papieroskow");
        }
        //************************************************************************

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> people = new ArrayList<>();
//        for(int i=0; i<5; i++) {
//            String firstName = firstNames[random.nextInt(firstNames.length)];
//            String lastName = lastNames[random.nextInt(lastNames.length)];
//            int age = ages[random.nextInt(ages.length)];
//            Person randomPerson = new Person(firstName, lastName, age);
//            people.add(randomPerson);
//        }
//        for(Person p: people) {
//            System.out.println(p);
//        }

        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            Person randomPerson = new Person(firstName, lastName, age);
            return  randomPerson;
        };
        for(int i=0; i<5; i++) {
            people.add(supplier.get());
        }
        for(Person p: people) {
            System.out.println(p);
        }

    }
}
