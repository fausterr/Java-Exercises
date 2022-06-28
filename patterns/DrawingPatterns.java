package patterns;

public class DrawingPatterns {
    public static void main(String[] args) {
        pattern8(6);
    }

    //right star triangle
    static void pattern1 (int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //left star triangle
    static void pattern2 (int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    //star pyramid
    static void pattern3 (int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //reverse star pyramid
    static void pattern4 (int n) {
        int i, j;
        for(i = n; i > 0; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //star diamond
    static void pattern5 (int n) {
        pattern3(n);
        int i, j;
        for(i = n; i > 0; i--) {
            for (j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //right alphabetic triangle
    static void pattern6 (int n) {
        int i, j;
        int alphabet = 65;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
    //circuit star pyramid
    static void pattern7 (int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else if (i == n) {
                for (j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (j = n - i + 3; j < n + i ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //circuit star diamond
    static void pattern8 (int n) {
        int i, j;
        pattern7(n);
        for (i = n-1; i > 0; i--) {
            for (j = i + 1; j <= n; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else if (i == n) {
                for (j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (j = 1; j < 2 * i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
