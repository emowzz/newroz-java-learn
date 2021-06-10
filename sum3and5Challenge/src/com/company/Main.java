package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0, count = 0;
        for (int i=1 ; i<=1000 ; i++)
        {
            if (count == 5){
                System.out.println(sum);
                break;
            }
            if (i % 3 == 0)
            {
                if (i % 5 == 0)
                {
                    sum += i;
                    System.out.println(i);
                    count++;
                }
            }
        }
    }
}
