import java.util.Scanner;

public class primeno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many prime numbers you want: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}