package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        // code block
        if (score <= 10000 && score >= 5000)
            System.out.println("Your score: " + score);
        else if (score > 10000)
            System.out.println("New High Score: " + score + "!");
        else
            System.out.println("Try again");
        // code block

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score: " + finalScore);
        }
    }
}
