import java.util.Scanner;

public class Currency_Exchange {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        // Prompt user to enter 0 to convert USD to RMB
        // or press 1 to convert RMB to USD
        System.out.print("Enter 0 to convert dollars to RMB and 1 vise versa: ");
        int option = input.nextInt();

        // Prompt user to enter the amount in USD or RMB
        // to convert to USD or RMB
        double amount;
        switch (option)
        {
            case 0: System.out.print("Enter the dollar amount: ");
                    amount = input.nextDouble();
                    System.out.println("$" + amount + " is "
                    + (amount * rate) + " yuan"); break;

            case 1: System.out.print("Enter the RMB amount: ");
                    amount = input.nextDouble();
                    System.out.println(amount + " yuan is $"
                    + ((int)((amount  * 100) / rate)) / 100.0);

            default: System.out.println("Incorrect Input");
        }
    }
}
