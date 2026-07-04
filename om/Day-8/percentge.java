import java.util.Scanner;

public class percentge {

    // Function to calculate percentage
    public static double calculate_percentage(double obtainedMarks, double maximumMarks) {
        return (obtainedMarks / maximumMarks) * 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Marks Obtained: ");
        double obtainedMarks = sc.nextDouble();

        System.out.print("Enter Maximum Marks: ");
        double maximumMarks = sc.nextDouble();

        double percentage = calculate_percentage(obtainedMarks, maximumMarks);

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}