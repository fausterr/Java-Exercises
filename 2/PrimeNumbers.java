package GeekForGeeksOrazInne;

public class PrimeNumbers {
    public static void main(String[] args) {
        primeLoop(11);
    }

    static void primeLoop(int n) {
        int x , y, flag;
        //flag 1 = is prime, flag = 0 is not prime

        for (x = 2; x <= n; x++) {
            flag = 1;
           //checking dividers from 2 to x/2 for each 2<=x<=n
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(x + " ");
            }
        }
    }
}
