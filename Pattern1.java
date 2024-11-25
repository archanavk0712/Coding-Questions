package DailyDoseDay3;

public class Pattern1 
{
    public static void main(String[] args) {
        // Number of rows for the pattern
        int rows = 5;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing the same number 'i' for 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}

