package TabliceISterowanie;

public class FizzBuzz {
    // https://stormit.pl/fizzbuzz/
    public static void main(String[] args) {
        for(int i = 0; i < 40; i++) {
            if (i%15 == 0) {
                System.out.println(i + " FIZZ");
            } else if(i%3 == 0){
                System.out.println(i + " BUZZ");
            } else if (i%5 == 0) {
                System.out.println(i + " FIZZBUZZ");
            }
        }

//        for(int i=1; i <= 100; i++) {
//            if(i%15 == 0)
//                System.out.println(i + " FizzBuzz");
//            else if(i%3 == 0)
//                System.out.println(i + " Fizz");
//            else if(i%5 == 0)
//                System.out.println(i + " Buzz");
//        }

    }
}
