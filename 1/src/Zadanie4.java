import org.w3c.dom.ls.LSOutput;

public class Zadanie4 {

    /*
    Write a program that reads a string and two integer numbers.
    These two numbers are representing a range that includes them both.
    Print the substring enclosed in this range.
    Both numbers are always greater than or equal to 0 and less than the string length.
     */

    public static void main(String[] args) {
        String txt = "Hello";
        int a = 3;
        int b = 3;
        if(a>=0 && b <txt.length() && b>a)
            System.out.println(txt.substring(1, 3));
        else
            System.out.println("--");
    }
}
