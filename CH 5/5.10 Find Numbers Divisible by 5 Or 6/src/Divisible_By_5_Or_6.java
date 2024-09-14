public class Divisible_By_5_Or_6 {
    public static void main(String[] args) {
        // variable to hold the count
        int count = 0;

        // variable to hold the numbers per line
        final int NUMBER_PER_LINE = 10;

        // for loop to test numbers from 100-1000
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % NUMBER_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
