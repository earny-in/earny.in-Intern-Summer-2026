import java.util.Scanner;

public class Average {

    // Function to calculate average
    public static double calculate_average(int mark1, int mark2, int mark3, int mark4, int mark5) {

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        return average;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for five subjects
        System.out.print("Enter marks of Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int mark3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int mark4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int mark5 = sc.nextInt();

        // Calling the function
        double average = calculate_average(mark1, mark2, mark3, mark4, mark5);

        // Displaying the result
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}