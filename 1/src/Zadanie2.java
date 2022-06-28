public class Zadanie2 {

    public static void main(String[] args) {

        /*
        Write a program that takes a sentence as input and returns the index of the first occurrence of the word "the" (can be part of a word), regardless of the capitalization.
        If there is no occurrence of it must output -1.
        For instance, if the sentence is “The apple is red.” the output should be 0,
        if the sentence is “I ate the red apple.” the output should be 6,
        and if the sentence is “I love apples.” the output should be -1.
        Note, the and The are equal.
         */

        String input = "I ate the red apple."; //The apple is red.
        char[] chars = input.toCharArray();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for(int i=0; i<chars.length-3; i++) {
            s1 = Character.toString(chars[i]);
            s2 = Character.toString(chars[i+1]);
            s3 = Character.toString(chars[i+2]);
            if(s1.equals("t") || s1.equals("T")) {
                if(s2.equals("h")) {
                    if(s3.equals("e")) {
                        System.out.println(i);
                    }
                }
            }
        }

        String input2 = "I ate the red apple."; //The apple is red.
        char[] chars2 = input2.toCharArray();
        String s11 = "";
        String s22 = "";
        String s33 = "";
        for(int i=0; i<chars2.length-3; i++) {
            s11 = Character.toString(chars2[i]);
            s22 = Character.toString(chars2[i+1]);
            s33 = Character.toString(chars2[i+2]);
            if(s11.equals("T") || s11.equals("t") & s22.equals("h") & s33.equals("e")) {
                System.out.println(i);
            }
        }
    }
}
