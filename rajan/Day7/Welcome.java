import java.util.Scanner;

public class Welcome {

    public static void welcome_intern(String name) {

        System.out.println("\nWelcome " + name + "!");
        System.out.println("We are excited to have you as part of our internship program.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Intern Name: ");
        String name = sc.nextLine();

        welcome_intern(name);

        sc.close();
    }
}