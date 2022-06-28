public class Zadanie1 {

    public static void main(String[] args) {

//        char charValue = '2';
//        int intValue = Character.getNumericValue(charValue); // 2
        /*
        LICZENIE SUMY PIERWSZYCH I OSTATNICH 3 CYFR W STRINGU
        NAJPIERW PRZEKSZTALCANIE NA TABLICE CHAR A POTEM PETLE
         */

        String input1 = "0123456";
        char[] chars = input1.toCharArray();

        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<3; i++) {
            sum1 += Character.getNumericValue(chars[i]);
        }
        System.out.println(sum1);

        for(int i=chars.length-1; i>chars.length-4; i--) {
            sum2 +=Character.getNumericValue(chars[i]);
        }
        System.out.println(sum2);
    }
}
