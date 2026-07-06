import java.util.Scanner;

public class StudentProfile {
    
    public static void student_profile(String name, String branch) {
        System.out.println("Student Profile");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String branch = scanner.nextLine();
        
        student_profile(name, branch);
        
        scanner.close();
    }
}