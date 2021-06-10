package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        while (count != 6)
        {
            System.out.println("Count value is "+count);
            count++;
        }

//        for (count=1 ; count!=6 ; count++)
//        {
//            System.out.println("Count value is "+count);
//        }

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is "+count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was "+count);
            count++;
        }
        while(count!= 6);

        int number = 4;
        int finishNumber = 20;
        int totolEvenNumber = 0;
        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number))
                continue;
            totolEvenNumber++;
            System.out.println("Even Numbers "+number);
            if (totolEvenNumber == 5)  {
                break;
            }

        }



    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }

}
