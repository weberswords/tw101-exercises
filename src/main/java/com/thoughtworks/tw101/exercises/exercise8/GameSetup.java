package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by Quits on 7/17/17.
 */

public class GameSetup {


    Guess guess = new Guess();

    private int getRandomNumber() {
        Random randInt = new Random();
        int randomNumber = randInt.nextInt(100) + 1;
        return randomNumber;
    }


    public void playGame() {
        boolean playGame = true;
        while (true) {
            int answer = getRandomNumber();
            System.out.println("Would you like to play a game? \n");
            do {
                int userGuess = guess.getGuess();
                playGame = guess.checkGuess(userGuess, answer);
            } while (playGame == true);
        }
    }
}
