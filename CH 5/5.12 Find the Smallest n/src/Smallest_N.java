public class Smallest_N {
    public static void main(String[] args) {
        // variable n equal to 0
        int n = 0;

        // While loop to find smallest integer that is n^2 is greater than 12,000
        while (Math.pow(n, 2) < 12000) {
            n++;
        }

        // Display results
        System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
    }
}
