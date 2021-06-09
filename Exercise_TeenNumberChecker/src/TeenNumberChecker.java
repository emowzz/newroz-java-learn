public class TeenNumberChecker {
    public static boolean hasTeen (int teenCheckNumberOne, int teenCheckNumberTwo, int teenCheckNumberThree) {
        if (teenCheckNumberOne <= 19 && teenCheckNumberOne >=13)
            return true;
        if (teenCheckNumberTwo <= 19 && teenCheckNumberTwo >=13)
            return true;
        if (teenCheckNumberThree <= 19 && teenCheckNumberThree >=13)
            return true;
        return false;
    }

    public static boolean isTeen(int teenNumberCheck)
    {
        if (teenNumberCheck >= 13 && teenNumberCheck <= 19)
        {
            return true;
        }
        return false;
    }
}
