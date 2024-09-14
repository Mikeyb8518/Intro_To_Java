public class Largest_N {
    public static void main(String[] args) {
        // variable to hold n
        int n = 0;

        // while loop to find the largest integer n such n^3 is less than 12,000
        while (Math.pow(n + 1, 3) < 12000) {
            n++; // increment n
        }
        // Display results
        System.out.println("Largest integer n such that n^3 is less than 12,000: " + n);
    }
}
