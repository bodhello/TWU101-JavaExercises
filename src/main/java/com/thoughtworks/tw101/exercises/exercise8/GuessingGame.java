package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class GuessingGame {
    private static final int UPPER_BOUND = 100;
    private static final int LOWER_BOUND = 1;
    private int answer;
    private boolean gameOver = true;
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    GuessingGame() {
        this.answer = (int) (Math.random() * (UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND);
    }

    public void startGame() throws NumberFormatException {
        Scanner reader = new Scanner(System.in);
        String input;
        int guess;
        gameOver = false;

        while (!gameOver) {
            System.out.printf("Please guess a number between %d and %d: ", LOWER_BOUND, UPPER_BOUND);
            input = reader.next();
            try {
                guess = Integer.parseInt(input);
                gameOver = guessNum(guess);
                guesses.add(guess);
            } catch (NumberFormatException e) {
                System.out.println("BAD INPUT. Please guess a number.");
            }
        }
        endGame();
    }

    public void endGame(){
        System.out.println("Your previous guesses: ");
        for (int guess : guesses){
            System.out.print(guess + " ");
        }
    }

    public boolean guessNum(int guess) {
        if (guess == this.answer){
            System.out.println("Congrats! The correct number was " + this.answer + ". \nYOU WIN");
            return true;
        }
        else if (guess < this.answer){
            System.out.println("Your guess is TOO LOW. Try again!");
        }
        else {
            System.out.println("Your guess is TOO HIGH. Try again!");
        }
        return false;
    }
}
