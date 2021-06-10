public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int reverseNumber = 0, lastDigit;
        int mainNumber = number;

        while(number != 0){
            lastDigit = number % 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber += lastDigit;
            number = number / 10;
        }
        if (mainNumber == reverseNumber)
            return true;
        return false;
    }
}
