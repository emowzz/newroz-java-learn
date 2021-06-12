public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        if (number < 0)
            return -1;

        int sum = 0, modNumber;
        while(number != 0)
        {
            modNumber = number % 10;
            number -= modNumber;
            if (modNumber % 2 == 0)
                sum += modNumber;
            number /= 10;

        }
        return sum;
    }
}
