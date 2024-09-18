public class Display_ASCII_Table {
    public static void main(String[] args) {
        // constant to hold number per line 10
        final int NUM_PER_LINE = 10;

        // Variable to hold count
        int count = 0;
        // For loop to display ASCII characters ! to ~
        for (int i = 33; i <= 126; i++) {
            count++; // Increment count
            // if statement to display 10 characters per line
            if (count % 10 == 0) {
                System.out.println((char)i);
            }
            else {
                System.out.print((char)i + " ");
            }
        }
        System.out.println();
    }
}
