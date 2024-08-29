import java.util.Scanner;

public class Days_Of_Month {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter year and month
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Test for boolean
        boolean leapYear =
                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        // Display the number of days in month
        System.out.print(month + " " + year + " has ");

        // if statement for months
        if (month.equals("Jan") || month.equals("Mar") ||
                month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec"))
            System.out.println(31 + " days");
        else if (month.equals("Apr") || month.equals("Jun") ||
                month.equals("Sep") || month.equals("Nov"))
            System.out.println(30 + " days");
        else
            System.out.println(((leapYear) ? 29 : 28) + " days");
    }
}
