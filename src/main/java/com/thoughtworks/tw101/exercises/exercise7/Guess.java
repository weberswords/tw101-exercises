package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;
/**
 * Created by Quits on 7/17/17.
 */
public class Guess {

    int guess;
    Scanner input = new Scanner(System.in);

    public int getGuess() {
        do {
            System.out.println("Guess a number between 1 and 100: ");
            guess = Integer.parseInt(input.nextLine());
        } while(guess > 100 || guess < 1);
        return guess;
    }

    public boolean checkGuess(int guess, int answer) {
        if (guess == answer) {
            System.out.printf("You got it! The correct number was %d! \n", answer);
            return false;

        } else if (guess < answer) {
            System.out.println("Good effort! Go big or go home though.");
            return true;
        } else {
            System.out.println("Nice try! Try something smaller.");
            return true;

        }
    }

}
