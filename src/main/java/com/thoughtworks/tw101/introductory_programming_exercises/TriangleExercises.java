package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        drawAnAsterisk();
        drawAHorizontalLine(8);
        drawAVerticalLine(3);
        drawARightTriangle(3);
    }


    private static void drawAnAsterisk() {
        System.out.println("*");
    }

    private static void drawAHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    private static void drawAVerticalLine(int n) {
        for (int i=0; i<n; i++) {
            System.out.println("*");
        }
    }


    private static void drawARightTriangle(int n) {

        for (int i=1; i<=n; i++) {
            drawAHorizontalLine(i);
            System.out.println();
        }
    }
}
