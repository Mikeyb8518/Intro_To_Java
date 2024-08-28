import java.util.Scanner;

public class Grade_To_Number {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a grade letter A, B, C, D, F
        System.out.print("Enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <='F' && ch != 'E') {
            System.out.print("The numeric value for " + ch + " is ");
            switch (ch) {
                case 'A': System.out.println(4); break;
                case 'B': System.out.println(3); break;
                case 'C': System.out.println(2); break;
                case 'D': System.out.println(1); break;
                case 'F': System.out.println(0);
            }
        }
        else {
            System.out.println(ch + " is an invalid letter grade");
        }
    }
}
