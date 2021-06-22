public class Main {
    public static void main(String[] args) {
//        SortedArray sortedArray = new SortedArray();
        int[] array = SortedArray.getIntegers(5);

        array = SortedArray.sortIntegers(array);

        SortedArray.printArray(array);
    }
}
