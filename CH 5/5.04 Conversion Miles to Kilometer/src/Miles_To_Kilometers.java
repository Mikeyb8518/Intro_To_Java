public class Miles_To_Kilometers {
    public static void main(String[] args) {
        // Create a constant variable for kilometers to miles
        final double KILOMETERS_TO_MILES = 1.609;

        // Display header
        System.out.println("Miles        Kilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-13d%-10.3f\n", i, (i * KILOMETERS_TO_MILES));
        }
    }
}
