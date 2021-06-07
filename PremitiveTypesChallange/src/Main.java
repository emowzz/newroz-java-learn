public class Main {

    public static void main(String[] args)
    {
        //challenge
        byte challengeByteNumber = 100;
        short challengeShortNumber = 100;
        int challengeIntNumber = 100;
        long challengeLongNumber = 50000L + (10L * (challengeByteNumber + challengeShortNumber + challengeIntNumber));

        System.out.println(challengeLongNumber);

        short shortTotal = (short)(10000 + (10 * (challengeByteNumber + challengeShortNumber + challengeIntNumber)));
        System.out.println(shortTotal);
    }
}
