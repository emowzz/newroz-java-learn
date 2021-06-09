public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberToBeMatchedOne, double numberToBeMatchedTwo) {
        numberToBeMatchedOne *= 1000;
        numberToBeMatchedTwo *= 1000;
        if ((int)numberToBeMatchedOne == (int)numberToBeMatchedTwo){
            return true;
        }
        return  false;
    }
}
