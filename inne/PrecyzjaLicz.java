package TabliceISterowanie;

import java.util.Scanner;

public class PrecyzjaLicz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        if(a > 0) {
            for(double i = 0; i < (a + 0.1); i += 0.1) {
                System.out.printf("%.1f", i );
                System.out.print("  ");
            }
        } else if (a < 0) {
            for(double i = 0; i > (a - 0.1); i -= 0.1) {
                System.out.printf("%.1f", i );
                System.out.print("  ");
            }
        }
    }
}
