import java.util.Scanner;
import java.lang.Math; // Needed to use Math.round()


public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count=0;
        while(true)
        {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int num = scanner.nextInt();
                sum += num;
                count++;
            }
            else {
                System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/count));
                break;
            }
        }
        scanner.close();
    }
}
