import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter n1 and n2
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Formula to make GCD minimum of n1 and n2
        int gcd = n1 < n2 ? n1 : n2;

        // Find the great common divisor
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }

        // Display result
        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
    }
}
