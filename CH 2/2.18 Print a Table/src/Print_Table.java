public class Print_Table {
    public static void main(String[] args) {
        // float variable a, b
        float a, b;
        // display table
        System.out.println("a        b        pow(a, b)");
        a = 1;
        b = 2;

        System.out.println((int)a + "        " + (int)b +
                "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b +
                "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b +
                "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b +
                "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b +
                "        " + (int)Math.pow(a, b));
    }
}
