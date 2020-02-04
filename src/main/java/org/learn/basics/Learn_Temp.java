package org.learn.basics;

public class Learn_Temp {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);
        int negativeScore = calculateScore(false, 10000, 8, 200);
        System.out.println(negativeScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScore("Aman", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Khan", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Pathan", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScore("Amanullah", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScore(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        /*
        Optimization process -1
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) { //Here playerScore < 1000 will always return true, when reached. we can simply it but removing it.
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) { //Here playerScore < 500 will always return true, when reached. we can simply it but removing it.
            return 3;
        }
        return 4;
         */

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
