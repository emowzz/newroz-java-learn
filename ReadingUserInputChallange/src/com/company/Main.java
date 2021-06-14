package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);


        int sum=0, count=1;
        while (count <= 10)
        {
            System.out.println("Enter your number #"+count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt)
            {
                int number = scanner.nextInt();
                sum += number;
                count++;

            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        System.out.println(sum);

        scanner.close();

//        if (hasNextInt)
//        {
//            System.out.println("Enter number #1");
//            int number1 = scanner.nextInt();
//            System.out.println("Enter number #2");
//            int number2 = scanner.nextInt();
//            System.out.println("Enter number #3");
//            int number3 = scanner.nextInt();
//            System.out.println("Enter number #4");
//            int number4 = scanner.nextInt();
//            System.out.println("Enter number #5");
//            int number5 = scanner.nextInt();
//            System.out.println("Enter number #6");
//            int number6 = scanner.nextInt();
//            System.out.println("Enter number #7");
//            int number7 = scanner.nextInt();
//            System.out.println("Enter number #8");
//            int number8 = scanner.nextInt();
//            System.out.println("Enter number #9");
//            int number9 = scanner.nextInt();
//            System.out.println("Enter number #10");
//            int number10 = scanner.nextInt();
//            int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
//            System.out.println(sum);
//        }
//        else
//        {
//            System.out.println("Invalid Number");
//        }

    }
}
