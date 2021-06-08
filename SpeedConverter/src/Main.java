public class Main {
    public static void main(String[] args) {
       long milles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = "+milles);

        SpeedConverter.printConversion(10.5);
    }
}
