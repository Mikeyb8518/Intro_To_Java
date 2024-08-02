import java.util.Scanner;

public class Divisable_Operators {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Determine results
        // Display results
        System.out.println("Is number divisible by 5 and 6? " +
                ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is number divisible by 5 or 6? " +
                ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is number divisible by 5 or 6, but not both? " +
                ((number % 5 == 0) ^ (number % 6 == 0)));

    }
}
