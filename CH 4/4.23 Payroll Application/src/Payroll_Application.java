import java.util.Scanner;

public class Payroll_Application {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // Display payroll statement
        double grossPay, federal, state, totalDeduction, netPay;
        System.out.printf(
                "Employee Name: " + name +
                        "\nHours Worked: " + hoursWorked +
                        "\nPay Rate: $" + hourlyPayRate +
                        "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
                        "\nDeductions:\n   Federal Withholding (20.0%): $" +
                        (federal = grossPay * federalTaxRate) +
                        "\n   State Withholding (9.0%): $" + (state = grossPay * stateTaxRate) +
                        "\n   Total Deduction: $" + (totalDeduction = federal + state) +
                        "\nNet Pay: $" + (netPay = grossPay - totalDeduction)
        );
    }
}
