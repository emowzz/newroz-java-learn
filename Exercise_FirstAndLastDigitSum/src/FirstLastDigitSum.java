public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0)
        {
            return -1;
        }

        int lastNumber = number % 10;
        int modNumber;
        while(number > 9)
        {
            modNumber = number % 10;
            number -= modNumber;
            number /= 10;
        }
        return  lastNumber+number;
    }
}
