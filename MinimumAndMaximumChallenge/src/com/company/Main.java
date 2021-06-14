package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int count=1, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        while(true)
        {
            System.out.println("Enter number no : "+count );
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int num = scanner.nextInt();
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
            }
            else {
                System.out.println("minimum number "+min+" maximum number "+max);
                break;
            }

            count++;
        }

        scanner.close();

    }
}
