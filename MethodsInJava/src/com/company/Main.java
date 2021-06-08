package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore);


        String playerName = "Fahim Foysal Emon";
        int positionScore = 80;
        displayHighScorePosition(playerName, positionScore);

        int returnData = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",returnData);

        returnData = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",returnData);

        returnData = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",returnData);

        returnData = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",returnData);

        returnData = calculateHighScorePosition(1000);
        displayHighScorePosition("Emon",returnData);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionScore) {
        System.out.println(playerName+" managed to get into position "+positionScore+" on the high score table");
    }

    public static int calculateHighScorePosition(int positionScore) {
//        if (positionScore >= 1000)
//            return 1;
//        if (positionScore >= 500)
//            return 2;
//        if (positionScore >= 100);
//            return 3;
//        return 4;

        //alternative way to return
        int position = 4;
        if (positionScore >= 1000)
            position = 1;
        if (positionScore >= 500)
            position = 2;
        if (positionScore >= 100)
            position = 3;
//
//        return position;

    }
}
