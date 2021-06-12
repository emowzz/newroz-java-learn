public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree)
    {
        if (numberOne < 10 || numberOne > 1000 || numberTwo < 10 || numberTwo > 1000 || numberThree < 10 || numberThree > 1000)
        {
            return false;
        }
        int numberOneRightMost = numberOne % 10;
        int numberTwoRightMost = numberTwo % 10;
        int numberThreeRightMost = numberThree % 10;

        if (numberOneRightMost == numberTwoRightMost)
            return true;
        if (numberOneRightMost == numberThreeRightMost)
            return true;
        if (numberTwoRightMost == numberThreeRightMost)
            return true;
        return false;
    }

    public static boolean isValid(int number)
    {
        if (number >= 10 && number <= 1000)
            return true;
        return false;
    }
}
