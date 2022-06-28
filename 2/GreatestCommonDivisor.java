package GeekForGeeksOrazInne;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b  = scanner.nextInt();

        System.out.println(gcdEuclidsAlgorithm(1250, 455));
        System.out.println(gcdEuclidsAlgorithm(455, 1250));
    }

    static int gcdLoop(int a, int b) {
        int result = 1;
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    static int gcdEuclidsAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            System.out.println("a = " + a + ", b = " + b);
        }
        return gcdEuclidsAlgorithm(b, a % b);
    }
}
