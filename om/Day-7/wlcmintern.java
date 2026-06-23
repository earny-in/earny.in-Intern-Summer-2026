import java.util.Scanner;

public class wlcmintern {
    public static void intern(String name){
        System.out.println("Welcome, " + name + "!");
        System.out.println("We are excited to have you as part of our internship program.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        intern(name);

        sc.close();
    }
}
