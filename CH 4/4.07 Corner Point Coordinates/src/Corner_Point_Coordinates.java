import java.util.Scanner;

public class Corner_Point_Coordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();

        // calculate the coordinates of the five corner points
        double[] p1 = calculatePoint(radius, 0);
        double[] p2 = calculatePoint(radius, 72);
        double[] p3 = calculatePoint(radius, 144);
        double[] p4 = calculatePoint(radius, 216);
        double[] p5 = calculatePoint(radius, 288);

        // display the coordinates of the five corner points
        System.out.println("P1: (" + String.format("%.2f", p1[1]) + ", " + String.format("%.2f", p1[0]) + ")");
        System.out.println("P2: (" + String.format("%.2f", p2[1]) + ", " + String.format("%.2f", p2[0]) + ")");
        System.out.println("P3: (" + String.format("%.2f", p3[1]) + ", " + String.format("%.2f", p3[0]) + ")");
        System.out.println("P4: (" + String.format("%.2f", p4[1]) + ", " + String.format("%.2f", p4[0]) + ")");
        System.out.println("P5: (" + String.format("%.2f", p5[1]) + ", " + String.format("%.2f", p5[0]) + ")");
    }

    // calculate the coordinates of a point on the pentagon
    private static double[] calculatePoint(double radius, double angle) {
        double x = radius * Math.cos(Math.toRadians(angle));
        double y = radius * Math.sin(Math.toRadians(angle));
        return new double[]{x, y};
    }
}
