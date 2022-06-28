package TabliceISterowanie;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 5;
//        for(int i = x; i > 0; i--) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < x; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            y--;
//        }

        draw(5);
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    private static void drawStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    private static void draw(int size) {
        for (int i = 0; i < size; i++) {
            drawSpaces(size-i-1);
            drawStars(size);
            System.out.println(); //new line
        }
    }
}
