package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your BirthYear : ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int birthYear = scanner.nextInt();
            int age = 2021-birthYear;

            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();


            if (age>=0 && age <= 100)
            {
                System.out.println("your name is "+name+" and your age is "+age);
            }
            else {
                System.out.println("Invalid Year of birth");
            }
        }
        else {
            System.out.println("Age should have been writeen");
        }

        scanner.close();
    }
}
