import java.util.Scanner;

public class Monetary_Units {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // User enter an amount in double
        System.out.print("Enter an amount in double(ex 11.45) : ");
        // double amount variable
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // num of dollars
        int num_Of_Dollars = remainingAmount / 100;
        remainingAmount %= 100;

        // num of quarters
        int num_Of_Quarters = remainingAmount / 25;
        remainingAmount %= 25;

        // num of dimes
        int num_Of_Dimes = remainingAmount / 10;
        remainingAmount %= 10;

        // num of nickles
        int num_Of_Nickles = remainingAmount / 5;
        remainingAmount %= 5;

        // num of pennies
        int num_Of_Pennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + num_Of_Dollars +
                (num_Of_Dollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + num_Of_Quarters +
                (num_Of_Quarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + num_Of_Dimes +
                (num_Of_Dimes == 1 ? " dime" : " dimes"));
        System.out.println(" " + num_Of_Nickles +
                (num_Of_Nickles == 1 ? " nickel" : " nickels"));
        System.out.println(" " + num_Of_Pennies +
                (num_Of_Pennies == 1 ? " pennie" : " pennies"));
    }
}
