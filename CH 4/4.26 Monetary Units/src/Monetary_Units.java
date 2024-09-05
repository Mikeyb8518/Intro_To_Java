import java.util.Scanner;

public class Monetary_Units {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();

        // Extract the number of dollars
        String numOfDollars = amount.substring(0, amount.indexOf('.'));

        // Extract cents
        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        // Find number of quarters
        int numOfQuarters = cents / 25;
        cents %= 25;

        // Find number of dimes
        int numOfDimes = cents / 10;
        cents %= 10;

        // Find number of nickles
        int numOfNickles = cents / 5;
        cents %= 5;

        // Display results
        System.out.println("Your amount " + amount + " consists of\n "
        + numOfDollars + " dollars\n "
        + numOfQuarters + " quarters\n "
        + numOfDimes + " dimes\n "
        + numOfNickles + " nickles\n "
        + cents + " pennies\n ");
    }
}
