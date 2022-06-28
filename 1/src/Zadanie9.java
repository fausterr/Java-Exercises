import java.util.ArrayList;

public class Zadanie9 {

    /*
    Implement a method to concatenate all positive numbers of two input ArrayLists to a single resulting list.
    At first, elements from the first ArrayList should go, and then the elements from the second ArrayList.
    * */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-4);
        numbers.add(-8);
        numbers.add(3);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers.add(2);
        numbers.add(-4);
        numbers.add(-8);
        numbers.add(31);
        concatPositiveNumbers(numbers, numbers2);
        numbers.forEach(System.out::println);
    }
    //TO JEST OK
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        l1.addAll(l2);
        l1.removeIf(x -> x<0);
        return l1;
    }

    //TA METODA JEST ZLA!!!!!!!!
    //To by sie sprawdzilo, gdyby dodac 3 listę 
    public static ArrayList<Integer> concatPositiveNumbers2(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        for(Integer i: l1) {
            if(i<=0) {
                l1.remove(i);
            }
        }
        for(Integer i2: l2) {
            if(i2>0) {
                l1.add(i2);
            }
        }
        return l1;
    }
}
