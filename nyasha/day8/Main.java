import java.util.Scanner;

public class Main {

    // Function to calculate percentage
    public static double calculate_percentage(int marksObtained, int maximumMarks) {
        double percentage = (marksObtained * 100.0) / maximumMarks;
        return percentage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Marks Obtained: ");
        int marksObtained = sc.nextInt();

        System.out.print("Maximum Marks: ");
        int maximumMarks = sc.nextInt();

        // Calling the function
        double result = calculate_percentage(marksObtained, maximumMarks);

        // Displaying the result
        System.out.printf("Percentage: %.1f%%", result);

        sc.close();
    }
}