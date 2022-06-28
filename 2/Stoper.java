package GeekForGeeksOrazInne;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start;

        do {
            System.out.println("type START");
            start = scanner.nextLine();
        } while (!start.equals("START"));
        Instant instant1 = Instant.now();

        String stop;
        do {
            System.out.println("type STOP");
            stop = scanner.nextLine();
        } while (!stop.equals("STOP"));
        Instant instant2 = Instant.now();

        Duration duration = Duration.between(instant1, instant2);
        System.out.println("Elapsed time: " + duration.getSeconds() + " seconds");
    }
}
