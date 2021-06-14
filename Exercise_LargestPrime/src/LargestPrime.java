public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        int longestPrime=0;
        if (isPrime(number))
            return number;
        else {
            for (int i=2 ; i<number ; i++)
            {
                if (number % i == 0)
                {
                    if (isPrime(i))
                    {
                        longestPrime = i;
                    }
                }
            }
        }
        return longestPrime;

    }

    public static boolean isPrime(int number)
    {
        int prime=1;
        for (int i=2 ; i<number/2 ; i++)
        {
            if(number%i == 0)
                prime=0;
        }
        if (prime == 1)
            return true;
        return false;
    }
}
