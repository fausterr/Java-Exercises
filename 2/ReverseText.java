package GeekForGeeksOrazInne;

import java.util.Stack;

public class ReverseText {
    public static void main(String[] args) {
        String text = "Text";
        //1
        System.out.println(reverseString(text));

        //2
        String result = new StringBuilder(text).reverse().toString();
        System.out.println(result);
    }

    public static String reverseString(String text){
        char[] chars  = text.toCharArray();
        String result = "";
        for(int i = chars.length - 1; i >= 0; i--){
            result += chars[i];
        }
        return result;
    }
}
