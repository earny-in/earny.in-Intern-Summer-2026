
import java.util.Scanner;
public class numbers {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(" enter 0 for print Even or 1 for Odd : ");
int choice = sc.nextInt();

System.out.print("How many number do you want to print ? ");
int n = sc.nextInt();

if (choice == 0) {
System.out.println("First " + n + " even numbers are : ");

for (int i=1; i <=n ; i++)
{ System.out.print(i*2 + "");
}
}
else if (choice == 1){
System.out.print("First " + n + " odd numbers are : ");
for (int i=1 ; i<=n ; i++)
{ System.out.print((i*2) - 1 + "");
}
}
else {
System.out.println("Invalid choice");
sc.close();
}
}
}