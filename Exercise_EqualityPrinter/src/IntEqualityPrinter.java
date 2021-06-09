public class IntEqualityPrinter {
    public static void printEqual(int numberToBeEqualOne, int numberToBeEqualTwo, int numberToBeEqualThree) {
        if (numberToBeEqualOne >= 0 && numberToBeEqualTwo >= 0 && numberToBeEqualThree >= 0) {
            if (numberToBeEqualOne == numberToBeEqualTwo) {
                if (numberToBeEqualTwo == numberToBeEqualThree) {
                    System.out.println("All numbers are equal");
                }
                else
                    System.out.println("Neither all are equal or different");


            }
            else if (numberToBeEqualOne != numberToBeEqualTwo) {
                if (numberToBeEqualOne == numberToBeEqualThree) {
                    System.out.println("Neither all are equal or different");
                }
                else if (numberToBeEqualTwo == numberToBeEqualThree) {
                    System.out.println("Neither all are equal or different");
                }
                else if (numberToBeEqualTwo != numberToBeEqualThree) {
                    System.out.println("All numbers are different");
                }

            }
            else
                System.out.println("Neither all are equal or different");
        }
        else
            System.out.println("Invalid Value");
    }
}
