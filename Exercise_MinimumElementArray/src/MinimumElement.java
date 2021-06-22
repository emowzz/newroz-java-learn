import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner;

    private static int readInteger()
    {
        scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        return element;
    }

    private static int[] readElements(int number)
    {
        scanner = new Scanner(System.in);

        int[] array = new int[number];
        for(int i=0 ; i<number ; i++)
        {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array)
    {

        int minimum = array[0];
        for(int i=0 ; i<array.length ; i++)
        {

            if (array[i] < minimum)
            {
                minimum = array[i];
            }
        }

        return minimum;
    }

}
