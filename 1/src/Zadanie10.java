import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
Write a program that finds out the closest integer to a given one from an array.
If you find several integers with the same distance to the N, you should output all of them in the ascending order.
If the are several equal numbers, output them all.

Input: a set of integers and a number N.
Output: some number(s) from the given array.
 */

public class Zadanie10 {

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 3, 3, 1, 5));
        ArrayList<Integer> diff = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        int x = 4;
        int y = 0;

        y = input.get(0) - x;
        if(y < 0)
            y*=-1;
        diff.add(y);
        output.add(input.get(0));

        for(int i=1; i<input.size(); i++) {
            y = input.get(i) - x;
            if(y < 0)
                y*=-1;
            if(y<diff.get(0)) {
                diff.clear();
                output.clear();
                diff.add(y);
                output.add(input.get(i));
            } else if(y==diff.get(0)) {
                output.add(input.get(i));
            }
        }
        Collections.sort(output);
        output.forEach(e -> System.out.print(e + " "));
    }
}
