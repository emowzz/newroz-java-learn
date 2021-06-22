import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SortedArray sortedArray = new SortedArray();
        int[] array = SortedArray.getIntegers(5);

        array = SortedArray.sortIntegers(array);

        SortedArray.printArray(array);

        int[] myAnotherArray = array;

        System.out.println(Arrays.toString(myAnotherArray));

        myAnotherArray[4] = 100;

        System.out.println(Arrays.toString(myAnotherArray));
        System.out.println(Arrays.toString(array));

        int a = 5;
        int b = a;
        b++;
        System.out.println("a= "+a+", b= "+b);


    }
}
