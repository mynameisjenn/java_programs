package com.jenniferhatton;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is: " + highScore);



        int positionOnTable = calculateHighScorePosition(1000);
        displayHighScorePosition("Jen", positionOnTable);

        positionOnTable = calculateHighScorePosition(900);
        displayHighScorePosition("Ben", positionOnTable);

        positionOnTable = calculateHighScorePosition(400);
        displayHighScorePosition("Sam", positionOnTable);

        positionOnTable = calculateHighScorePosition(50);
        displayHighScorePosition("Jules", positionOnTable);
    }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if(gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            } else {
                return -1;
            }

        }

        public static void displayHighScorePosition(String playerName, int positionOnTable) {
            System.out.println(playerName + " managed to get into position " + positionOnTable + " on the high score table.");
        }

        public static int calculateHighScorePosition(int playerScore) {

            int defaultPosition = 4;

            if(playerScore >= 1000) {
                defaultPosition = 1;
            } else if (playerScore >= 500 ) {
                defaultPosition = 2;
            } else if (playerScore >= 100) {
                defaultPosition = 3;
            }
            return  defaultPosition;



//            if(playerScore >= 1000) {
//                return  1;
//            } else if (playerScore >= 500) {
//                return  2;
//            } else  if (playerScore >= 100) {
//                return 3;
//            }
//            return 4;
        }

}
