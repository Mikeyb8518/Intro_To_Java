import java.util.Scanner;

public class Highest_Score {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        int highestScore = 0; // variable to hold highest score
        String highestScoreName = ""; // Variable to hold the name of the highest score

        // Ask user to enter number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        // Prompt the user to enter the name of the students and score
        System.out.println("Enter the name of the students adn score: ");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = input.next();
            System.out.print("   Score: ");
            int score = input.nextInt();

            // Test for highest score
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }

        // Display the name of the student with the highest score
        System.out.println("Student with the highest score: " + highestScoreName);
    }
}
