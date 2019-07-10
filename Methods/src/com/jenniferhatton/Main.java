package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Jennifer", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Max", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Samuel", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Victoria", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");

    }


    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }


}
