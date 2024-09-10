public class Kilogram_Pounds {
    public static void main(String[] args) {
        // Constant variable for pounds per kilogram
        final double POUNDS_PER_KILOGRAM = 2.2;

        // Display header for table
        System.out.println("Kilograms      Pounds");

        // Display table
        for (int i = 1; i <= 199; i++) {
            System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}
