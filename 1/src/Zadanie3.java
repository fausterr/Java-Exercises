public class Zadanie3 {

    public static void main(String[] args) {

        //Write a program that reads a string and then output another string with doubled characters.

        String input = "Magda";
        String output = "";

        char[] chars = input.toCharArray();
        for(int i=0; i<chars.length; i++) {
            output += Character.toString(chars[i]) + Character.toString(chars[i]);
        }
        System.out.println(output);
    }
}
