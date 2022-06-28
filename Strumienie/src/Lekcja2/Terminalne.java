package Lekcja2;

import java.util.Optional;
import java.util.stream.Stream;

public class Terminalne {

    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        //courses.forEach(System.out::println); //nie bedzie dzialaly kilka metod jednoczesnie

        //long streamSize = courses.count();
        //System.out.println(streamSize);

        //Optional<Course> cheapestCourse = courses.min((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
        //cheapestCourse.ifPresent(System.out::println);

        //boolean under100 = courses.anyMatch(course -> course.getPrice() < 100);
        //if(under100)
        //    System.out.println("Co najmniej jeden z kursów jest tańszy niż 100zł");
        //boolean above10 = courses.allMatch(course -> course.getPrice() > 10);
        //if (above10)
        //    System.out.println("Wszystkie kursy są droższe od 10zł");
        //boolean above300 = courses.noneMatch(course -> course.getPrice() > 300);
        //if(above300)
        //    System.out.println("Żaden z kursów nie jest droższy od 300zł");

    }
}
