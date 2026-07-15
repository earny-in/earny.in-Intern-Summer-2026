import java.util.Scanner;
public class studentdetails {
public static void main ( String[] var0){
Scanner var1 = new Scanner(System.in);
System.out.print("Name:");
String var2 = var1.nextLine();
System.out.print("Age:");
int var3 = var1.nextInt();
System.out.print("Roll Number:");
int var4 = var1.nextInt();
System.out.println( "Student Details :");
System.out.println("Name"+var2);
System.out.println("Age"+var3);
System.out.println("Roll Number"+var4);
var1.close();
}
}