import java.util.Scanner;

public class palin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many palindrome numbers to print: ");
        int n = sc.nextInt();

// 123 rev 321 
        int i = 0; 
        int number = 1; //knot, phla point kya h

        while (i < n) {

            int originalNumber = number; // prnt krna h
            int temp = number; // update krna h
            int reverse = 0; // 

            while (temp != 0) {

                int digit = temp % 10; // single digit store hua cut ke
                temp = temp / 10; 
                reverse = reverse * 10 + digit;
            }

            if (originalNumber == reverse) {
                System.out.print(originalNumber + " ");
                i++;
            }

            number++;
        }

        sc.close();
    }
}    





//                 int digit = temp % 10; 
//                 temp = temp / 10; 
//                 reverse = reverse * 10 + digit;

// 489 
// 489%10 = 9 digit ------
// 489/10 = 48 temp
// 0 * 10 + 9 = 9 reverse
// 48%10 = 8 digit------
// 48/10 = 4 temp 
// 9 * 10 + 8 = 98 rev
// 4%10 = 4  digit ------
// 4/10 = 0 temp
// 98 * 10 + 4 = 984 rev
//loop break bcz temp = 0


