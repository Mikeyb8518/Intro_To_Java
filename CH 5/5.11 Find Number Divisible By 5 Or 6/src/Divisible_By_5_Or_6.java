public class Divisible_By_5_Or_6 {
    public static void main(String[] args) {
        // constant variable to hold 10 per line
        final int NUMBERS_PER_LINE = 10;
        // variable to hold count
        int count = 0;

        // for loop to count from 100 to 200
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                count++;

                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
