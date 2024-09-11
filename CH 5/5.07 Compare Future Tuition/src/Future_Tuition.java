public class Future_Tuition {
    public static void main(String[] args) {
        // Create total cost, tuition, tuition tenth year
        int totalCost = 0;
        int tuition = 10000;
        int tuitionTenthYear = 0;


        for (int year = 1; year <= 14; year++) {
            // Increase tuition ny 0.05% each year
            tuition += (int) (tuition * 0.05);
            // Test for after 10 years
            if (year > 10)
                totalCost += tuition;

            // Cost of tuition for 10 years
            if (year == 10)
                tuitionTenthYear = tuition;
        }

        // Display the cost of tuition in ten years
        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        // Display the cost of four years' worth of tuition after tenth year
        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
    }
}
