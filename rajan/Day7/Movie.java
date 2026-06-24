import java.util.Scanner;

public class Movie {

    public static void movie_booking(String cn, String mn) {

        System.out.println("Movie Booking Summary\n");
        System.out.println("Customer: " + cn);
        System.out.println("Movie: " + mn);
        System.out.println("Status: Booking Confirmed! Enjoy your movie :)");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String cn = sc.nextLine();

        System.out.print("Movie Name: ");
        String mn = sc.nextLine();

        movie_booking(cn, mn);

        sc.close();
    }
}