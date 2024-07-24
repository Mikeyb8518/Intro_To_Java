public class Random_Point {
    public static void main(String[] args) {
        // Generate random width and height
        int width = (int)((Math.random() * (50 + 50)) - 50);
        int height = (int)((Math.random() * (100 + 100)) - 100);

        // display results
        System.out.print("The rectangle is centered at point (0, 0)");
        System.out.println("with width 100 and height 200: (" + width + ", " + height + ")");
    }
}
