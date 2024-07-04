import java.util.Scanner;

public class Calculate_Interest {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter balance and interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%: ");
        // Balance and Interest variables
        double balance = input.nextDouble();
        double rate = input.nextDouble();

        // Interest formula
        double interest = balance * (rate / 1200);

        // Display results
        System.out.println("The interest is " + interest);
    }
}
