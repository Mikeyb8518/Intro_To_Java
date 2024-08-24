import java.util.Scanner;

public class Find_Character {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer between 0 and 127
        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        // Display integer as ASCII character
        System.out.println("The character for ASCII code " + i +" is " + (char) i);
    }
}
