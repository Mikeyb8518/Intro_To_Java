import java.util.Scanner;

public class Addition_Quiz {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Create two variables that generate random numbers 1- 100
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        // Prompt user to enter the answer
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        // Display result
        if (num1 + num2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong " + num1 + " + " + num2
                    + " should be " + (num1 + num2));
        }
    }
}
