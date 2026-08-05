import java.util.Scanner;

public class StudentDi {

    public static void student_profile(String name, String branch) {

        System.out.println("\nStudent Profile\n");

        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        student_profile(name, branch);

        sc.close();
    }
}