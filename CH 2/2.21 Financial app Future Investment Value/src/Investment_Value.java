import java.util.Scanner;

public class Investment_Value {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter investment amount
        System.out.print("Enter investment amount: ");
        // Amount variable
        double amount = input.nextDouble();
        // Enter interest rate in percentage
        System.out.print("\nEnter annual investment rate in percentage: ");
        // interest rate percentage
        double rate = input.nextDouble();
        rate /= 1200;
        // Enter number of years
        System.out.print("\nEnter number of years: ");
        // years variable
        double year = input.nextDouble();

        // Future investment formula
        double future_Investment = amount * Math.pow(1 + rate, year * 12);

        // Display results
        System.out.println("Future value is $" + future_Investment);
    }
}
