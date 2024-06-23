import java.util.Scanner;

public class Calculate_Tips {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter subtotal and gratuity
        System.out.print("Enter the subtotal and a gratuity rate: ");

        // Total and gratuity variables
        double total = input.nextDouble();
        double gratuity = input.nextDouble();

        // GratuityRate variable
        double gratuityRate = gratuity / 10;

        // subtotal variable
        double subtotal = gratuityRate + total;

        // Display results
        System.out.println("The gratuity is $" + gratuityRate + " and total is $" + subtotal);
    }
}
