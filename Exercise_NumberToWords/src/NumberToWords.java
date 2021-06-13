public class NumberToWords {
    public static void numberToWords(int number)
    {
        if (number < 0)
            System.out.println("Invalid Value");
        if (number == 0)
            System.out.println("Zero");

        int reversedNumber = reverse(number), remainder;
        int checkRevNum = reversedNumber;

        while (reversedNumber != 0)
        {
            remainder = reversedNumber % 10;
            if (remainder == 0)
                System.out.println("Zero");
            if (remainder == 1)
                System.out.println("One");
            if (remainder == 2)
                System.out.println("Two");
            if (remainder == 3)
                System.out.println("Three");
            if (remainder == 4)
                System.out.println("Four");
            if (remainder == 5)
                System.out.println("Five");
            if (remainder == 6)
                System.out.println("Six");
            if (remainder == 7)
                System.out.println("Seven");
            if (remainder == 8)
                System.out.println("Eight");
            if (remainder == 9)
                System.out.println("Nine");
            reversedNumber /= 10;
        }

//        System.out.println(getDigitCount(checkRevNum)+" "+getDigitCount(number));

        if (getDigitCount(checkRevNum) != getDigitCount(number))
        {
            for (int i=getDigitCount(checkRevNum) ; i<getDigitCount(number) ; i++)
            {
                System.out.println("Zero");
            }
        }




    }

    public static int reverse(int numberToBeReversed)
    {
        int modNumber, reverseNumber=0;

        do {
            modNumber = numberToBeReversed % 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber +=  modNumber;
            numberToBeReversed /= 10;
        }
        while (numberToBeReversed != 0);

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int i = 1, numLength=0;
        if (number == 0)
            return 1;
        while (i <= number)
        {
            numLength++;
            i *= 10;
        }
        return numLength;

    }
}
