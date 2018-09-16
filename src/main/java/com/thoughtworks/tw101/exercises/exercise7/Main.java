package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GuessingGame newgame = new GuessingGame();
        newgame.startGame();
    }
}

class GuessingGame {
    private int answer;
    private boolean gameOver = true;
    private static final int UPPER_BOUND = 100;
    private static final int LOWER_BOUND = 1;

    GuessingGame() {
        this.answer = (int) (Math.random() * (UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND);
    }

    public void startGame(){
        Scanner reader = new Scanner(System.in);
        int guess;
        gameOver = false;
        while (!gameOver) {
            System.out.printf("Please guess a number between %d and %d: ", LOWER_BOUND, UPPER_BOUND);
            guess = reader.nextInt();
            gameOver = guessNum(guess);
        }
    }

    public boolean guessNum(int guess){
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