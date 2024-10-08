import java.util.Scanner;

public class Point_Position {
    public static void main(String[] args) {
        // scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points p0, p1, and p2
        System.out.print("Enter three points p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // calculate point position
        double position = (x1 - x0) * (y2 - y0) - (x2 -x0) * (y1 - y0);

        // Display results
        System.out.print("(" + x2 + ", " + y2 + ") is on the ");
        if (position > 0) {
            System.out.print("left side of the ");
        }
        if (position < 0) {
            System.out.print("right side of the ");
        }
        System.out.println("line from (" + x0 + ", " + y0 +
                ") to (" + x1 + ", " + y1 + ")");
    }
}
