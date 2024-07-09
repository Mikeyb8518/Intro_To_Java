import java.util.Scanner;

public class Linear_Equations {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a, b, c, d, e, f
        System.out.print("Enter: a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // if statement, solve linear equation
        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
