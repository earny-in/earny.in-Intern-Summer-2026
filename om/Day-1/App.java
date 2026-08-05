// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hi earny.in - i am om, nice to meet you");
//     }
// }
import java.util.Scanner;
public class App {
   public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first sub marks: ");
    int sub1 = sc.nextInt();

    System.out.println("Enter second sub marks: ");
    int sub2 = sc.nextInt();

    System.out.println("Enter third sub marks: ");
    int sub3 = sc.nextInt();

    System.out.println("Enter fourth sub marks: ");
    int sub4 = sc.nextInt();

    System.out.println("Enter fifth sub marks: ");
    int sub5 = sc.nextInt();


    int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
    System.out.println("total marks: " + totalmarks);

    float percentage = (totalmarks / 500.0f) * 100;
    System.out.println("percentage:" + percentage);
}   
}