import java.util.Scanner;

public class Check_Substring {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter string 1
        System.out.print("Enter string 1: ");
        String string1 = input.nextLine();
        // Prompt user to enter string 2
        System.out.print("Enter string 2: ");
        String string2 = input.nextLine();

        // Display is string1 is a substring of string2
        System.out.println(string2 + ((string2.contains(string1)) ? " is " : " is not ") +
                "a substring of " + string1);
    }
}
