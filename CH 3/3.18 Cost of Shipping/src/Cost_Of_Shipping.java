import java.util.Scanner;

public class Cost_Of_Shipping {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight of package
        System.out.print("Enter weight of package: ");
        double weight = input.nextDouble();

        // Calculate weight of package
        if(weight < 50) {
            System.out.println("Package is to heavy");
        }
        else{
            double costPerPound;
            if (weight > 0 && weight <= 1) {
                costPerPound = 3.5;
            } else if (weight <= 3) {
                costPerPound = 5.5;
            } else if (weight <= 10) {
                costPerPound = 8.5;
            }
            else // if (weight <= 20)
                costPerPound = 10.5;
            System.out.println("Shipping cost of package is $" +
                    costPerPound * weight);
        }
    }
}
