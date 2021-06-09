package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Emon", 500);
        System.out.println("New score is "+newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,12);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player "+ playerName+ " scored "+score+" points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored "+score+" points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored unnamed points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >=0 && inches <= 12))
        {
            double centimeters = 0d;
             centimeters += (feet*30.48);
             centimeters += (inches*2.54);
            System.out.println("feet, "+feet+" inches "+inches+" = "+centimeters +" cm");
            return centimeters;
        }
        System.out.println("Invalid Feet or invalid Inches parameters");
        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        double feet;
        if (inches >= 0) {

            feet = (int)inches *  0.083;
            double remainingInches = (int)inches % 12;
            System.out.println("Feet "+feet+" inches "+remainingInches+" ");
            calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }




    }
