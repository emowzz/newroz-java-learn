public class EqualSumChecker {
    public static boolean hasEqualSum(int numberToBeAddedOne, int numberToBeAddedTwo, int numberToBeChecked) {
        if ((numberToBeAddedOne + numberToBeAddedTwo) == numberToBeChecked)
            return true;
        return false;
    }
}
