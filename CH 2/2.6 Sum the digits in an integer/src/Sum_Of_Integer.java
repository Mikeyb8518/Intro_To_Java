import java.util.Scanner;

public class Sum_Of_Integer {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer between 0 - 1000
        System.out.print("Enter an integer between 0 - 1000: ");

        // number variable
        int number = input.nextInt();

        // Compute the sum of the digits
        int lessThan10 = number % 10;        // Extract digits less than 10
        number /= 10;   // Remove extracted digit

        int tens = number % 10;             // Extract digits between 10 - 99
        number /= 10;   // Remove extracted digit

        int hundreds = number % 10;         // Extract digits between 100 - 999
        number /= 10;   // Remove extracted digit

        // Sum of extracted digits
        int sum = hundreds + tens + lessThan10;

        // Display results
        System.out.println("The sum of the digits is: " + sum);
    }
}
