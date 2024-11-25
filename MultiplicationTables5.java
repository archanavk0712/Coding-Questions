package DailyDoseDay3;

public class MultiplicationTables5 
{
    public static void main(String[] args) 
    {
        // Given number for which multiplication table is to be generated
        int number = 5;

        // Loop through numbers 1 to 10 to generate the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            // Multiply the number by the loop variable and print the result
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
