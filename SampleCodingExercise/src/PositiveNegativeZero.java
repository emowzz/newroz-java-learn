public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
    }

    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("zero");
        }

    }
}
