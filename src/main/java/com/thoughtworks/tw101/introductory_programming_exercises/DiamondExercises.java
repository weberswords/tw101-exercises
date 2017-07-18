package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    private static void drawLine(int n, int level) {
        int charsWide = n*2-1;
        int asterisksWide = level*2-1;
        int spacesNow = (charsWide-asterisksWide)/2;

        for(int i=0;i<spacesNow;i++) {
            System.out.print(" ");
        }
        for(int j=0; j< asterisksWide; j++) {
            System.out.print("*");
        }
        for(int k=0;k<spacesNow; k++) {
            System.out.print(" ");
        }
        System.out.print("\n");

    }

    private static void drawMiddleLine(int n) {
        for(int m = 0; m < n*2-1; m++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    private static void drawMiddleLine(String string){
        System.out.print(string);
        System.out.print("\n");
    }

    private static void drawDiamondBottom(int n) {
        int level =n-1;
        while ( level > 0) {
            drawLine(n, level);
            level--;
        }
    }

    private static void drawTriangle(int n) {
        int level =1;
        while ( level < n) {
            drawLine(n, level);
            level++;
        }
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
       drawTriangle(n);
       drawMiddleLine(n);

    }


//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawTriangle(n);
        drawMiddleLine(n);
        drawDiamondBottom(n);
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
        drawTriangle(n);
        drawMiddleLine("Stephanie");
        drawDiamondBottom(n);
    }
}
