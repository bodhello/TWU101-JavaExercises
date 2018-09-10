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
        String spaces = "";
        String stars = "*";
        for (int i = n; i > 1; --i) {
            spaces += " ";
        }
        for (int j = 0; j < n; ++j){
            System.out.println(spaces + stars);
            stars += "**";
            spaces = spaces.substring(0,
                    spaces.length()-1 > 0 ? spaces.length()-1 : 0);
        }
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
        String spaces = " ";
        String stars = "*";
        for (int i = n; i > 2; --i) {
            stars += "**";
        }
        for (int j = 0; j < n; ++j){
            System.out.println(spaces + stars);
            spaces += " ";
            stars = stars.substring(0,
                    stars.length()-2 > 0 ? stars.length()-2 : 0);
        }

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

    }
}
