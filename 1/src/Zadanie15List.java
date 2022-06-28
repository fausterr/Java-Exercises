import java.util.*;
import java.util.stream.Collectors;

public class Zadanie15List {
    /*
    Write a program that reads the list of integer numbers separated by spaces from the standard input and then remove all numbers with even indexes (0, 2, 4, and so on).
    After that, the program should output the resulting sequence in the reverse order.
     */
    public static void main(String[] args) {

        //1 dziala jak input wstawic ze spacjami: 1 2 3 4 5 6 7
        List<Integer> numbers = Arrays
                .stream(new Scanner(System.in).nextLine().split("\\s+")) //mozna tez dac split(" ")
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers.removeIf(n -> n%2 != 0);
        Collections.reverse(numbers);
        numbers.forEach(System.out::println);

        //2
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean isOdd = false;
        while (scanner.hasNextInt()) {
            if (isOdd) {
                arrayList.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
            isOdd = !isOdd;
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            System.out.printf("%d ", arrayList.get(i));
        }

        //3
        Scanner scanner2 = new Scanner(System.in);
        String[] str = scanner2.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(str));
        list.removeIf(e -> list.indexOf(e) % 2 == 0);
        Collections.reverse(list);
        list.forEach(e -> System.out.print(e  + " "));
        //String formatted = list.toString().replace("[", "").replace(",", "").replace("]", "");  inny sposob
    }
}
