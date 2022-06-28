import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie8 {

    //Roznie sposoby wyswietlenia zawartosci listy
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        //1
        nameList.forEach(System.out::println);

        //2
        for(int i=0; i<nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        //3
        for(String s: nameList) {
            System.out.println(s);
        }

        //4 to dziala tylko dla listy ze stringami
        System.out.println(String.join("\n", nameList));

        //5
        nameList.forEach(name -> System.out.println(name));
    }
}
