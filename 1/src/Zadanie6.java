public class Zadanie6 {

    /*
    Write a program that reads two lines and compares them without whitespaces.
    The program should prints true if both lines are equal, otherwise – false.
     */

    public static void main(String[] args) {
        //input1
        String txt = "  string";
        String txt2 = "str ing ";
        //input2 "string", "my string"

        String txt3 = txt.replaceAll(" ", "");
        String txt4 = txt.replaceAll(" ", "");
        System.out.println(txt.equals(txt2));
        System.out.println(txt3.equals(txt4));
    }
}
