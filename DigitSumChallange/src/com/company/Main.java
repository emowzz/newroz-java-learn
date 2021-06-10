package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sum of the digits are "+sumDigits(-1));
        System.out.println("sum of the digits are "+sumDigits(-125));
        System.out.println("sum of the digits are "+sumDigits(4));
        System.out.println("sum of the digits are "+sumDigits(32123));

    }

    private static int sumDigits (int number)
    {
        int numberAfterPoints, sumOfNumbers = 0;
        if (number >= 10) {
            while (number > 0){
                numberAfterPoints = number % 10;
                sumOfNumbers += numberAfterPoints;
                number = number / 10;
            }
            return sumOfNumbers;
        }
        return -1;
    }
}
