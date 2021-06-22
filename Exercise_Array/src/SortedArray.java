import java.util.Scanner;

public class SortedArray {

    public static Scanner scanner;



    public static int[] getIntegers(int arraySize) {
        System.out.println("Enter your integers");
        scanner = new Scanner(System.in);

        int[] values = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            values[i] = scanner.nextInt();
        }
        return values;


    }

    public static int[] sortIntegers(int[] array)
    {
        int temp = 0;
        for(int i=0 ; i<array.length ; i++)
        {
            for(int j=i+1 ; j<array.length ; j++)
            {
                if (array[j] > array[i])
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i=0 ; i<array.length ; i++)
        {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }



}
