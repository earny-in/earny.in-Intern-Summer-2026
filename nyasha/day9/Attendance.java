import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array to store 5 student names
        String[] students = new String[5];

        // Take input from the user
        System.out.println("Enter the names of 5 students:");

        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

        // Display the attendance register
        System.out.println("\nAttendance Register");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }

        sc.close();
    }
}