import java.util.Scanner;

public class citydirectory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array to store 6 city names
        String[] cities = new String[6];

        // Take input from the user
        System.out.println("Enter 6 city names:");

        for (int i = 0; i < cities.length; i++) {
            cities[i] = sc.nextLine();
        }

        // Display all city names
        System.out.println("\nAvailable Travel Destinations");

        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i]);
        }

        sc.close();
    }
}