import java.util.Scanner;

public class StudentProfile {

    public static void student_profile(String name, String branch) {
        System.out.println("Student Profile");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        student_profile(name, branch);

        sc.close();
    }
}