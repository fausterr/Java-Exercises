import java.util.Arrays;
import java.util.List;

public class One {

    public static void main(String[] args) {

        Sum sum = (a,b) -> a+b;
        System.out.println(sum);

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.forEach(element -> System.out.print(element + " "));
        System.out.println();
        integerList.forEach(element -> {
             element*=2;
             System.out.print(element + " ");
        });
        System.out.println();
    }
}
