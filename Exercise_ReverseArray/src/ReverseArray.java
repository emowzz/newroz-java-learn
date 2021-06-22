import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array)
    {
        System.out.println("Array = " + Arrays.toString(array));

        int temp;

        for(int i=0 ; i<array.length ; i++)
        {
            for(int j = i+1; j<array.length ; j++)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        System.out.println("Reversed array = "+Arrays.toString(array));
    }

}
