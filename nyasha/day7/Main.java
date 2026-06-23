import java.util.Scanner;

public class Main {
    
    public static void welcome_intern(String name) {
        System.out.println("Welcome " + name + "!");
        System.out.println();
        System.out.println("We are excited to have you as part of our internship program.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String internName = scanner.nextLine();
        welcome_intern(internName);
        scanner.close();
    }
}