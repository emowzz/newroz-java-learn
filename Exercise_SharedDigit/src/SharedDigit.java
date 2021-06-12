public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo)
    {
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99)
        {
            return false;

        }
        else {
            //number one digits
            int numberOneLastDigit = numberOne % 10;
            numberOne -= numberOneLastDigit;
            int numberOneFirstDigit = numberOne / 10;

            //number two digits
            int numberTwoLastDigit = numberTwo % 10;
            numberTwo -= numberTwoLastDigit;
            int numberTwoFirstDigit = numberTwo / 10;

            if (numberOneFirstDigit == numberTwoFirstDigit)
                return true;
            if (numberOneFirstDigit == numberTwoLastDigit)
                return true;
            if (numberOneLastDigit == numberTwoFirstDigit)
                return true;
            if (numberOneLastDigit == numberTwoLastDigit)
                return true;
            return false;
        }



    }
}
