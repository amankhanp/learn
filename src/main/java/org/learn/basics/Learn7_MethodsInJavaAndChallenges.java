package org.learn.basics;

/**
 * ### Challenge-4 ###
 *
 * Create a method called displayHighScore
 * It should accept a player name as a parameter, and 2nd parameter as a position in the high score table
 * You should display the players name along with a message including playerName and his position
 * and the position they got.
 *
 * Create a 2nd method called calculateHighScorePosition
 * it should be sent one argument only, the player score.
 * it should return an int
 * the return data should be
 * 1 if the score is >1000
 * 2 if the score is >500 and <1000
 * 3 if the score is >100 and <500
 * 4 in all other cases
 * call both methods and display the results of the following
 * a score of 1500, 900, 400 and 50.
 */
public class Learn7_MethodsInJavaAndChallenges {

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
        } else {
            return 4;
        }

        Optimization process -2
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }

        Optimization process -3
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
         */

        //Optimization process -4
        /**
         * In this syntax, created created Local variable which returns a position value.
         */
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
