public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberTwo < 10)
            return -1;
        int i=1, fact=0;
        if (numberOne < numberTwo)
        {
            while(i != numberOne+1)
            {
                if (numberOne % i == 0) {
                    if (numberTwo % i == 0)
                        fact = i;
                }
                i++;
            }
            return fact;

        }
        if (numberTwo < numberOne){
            while(i != numberTwo+1)
            {
                if (numberTwo % i == 0)
                {
                    if (numberOne % i == 0)
                        fact = i;
                }
                i++;
            }
            return fact;

        }
        return -1;

    }
}
