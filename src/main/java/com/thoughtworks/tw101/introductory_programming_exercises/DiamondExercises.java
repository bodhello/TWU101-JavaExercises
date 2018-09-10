package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawNMinusOne(n);
        drawStarLine(n);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawNMinusOneFlip(n);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawNMinusOne(n);
        System.out.println("Bodhi");
        drawNMinusOneFlip(n);
    }

    // Helper
    // Given a number n, prints n-1 lines of a centered triangle
    private static void drawNMinusOne(int n) {
        StringBuilder line = new StringBuilder("");
        for (int i = n; i > 1; --i) {
            line.append(" ");
        }
        line.append("*");
        for (int j = 1; j < n; ++j){
            System.out.println(line.toString());
            line.append("**");
            line.deleteCharAt(0);
        }
    }

    // Helper
    // Given a number n, prints n-1 lines of an upsidedown centered triangle
    private static void drawNMinusOneFlip(int n) {
        StringBuilder line = new StringBuilder(" ");
        for (int i = n; i > 2; --i) {
            line.append("**");
        }
        line.append("*");
        for (int j = 1; j < n; ++j){
            System.out.println(line.toString());
            line.insert(0, " ");
            line.delete(line.length()-2,line.length());
        }
    }

    // Helper
    // Given a number n, prints n stars on a single line
    private static void drawStarLine(int n){
        System.out.print("*");
        for (int i = 1; i < n; ++i) {
            System.out.print("**");
        }
        System.out.println();
    }
}
