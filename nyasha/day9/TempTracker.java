import java.util.Scanner;

public class TempTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array to store temperatures for 7 days
        int[] temperature = new int[7];

        // Take input from the user
        System.out.println("Enter the temperature for 7 days:");

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperature[i] = sc.nextInt();
        }

        // Display all recorded temperatures
        System.out.println("\nWeekly Temperature Report");

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperature[i] + "°C");
        }

        sc.close();
    }
}