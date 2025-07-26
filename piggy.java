import java.util.Scanner;

public class piggy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 System.out.print("Enter number of 10 coins: ");
  int ten = sc.nextInt();
System.out.print("Enter number of 5 coins: ");
int five = sc.nextInt();
System.out.print("Enter number of 2 coins: ");
int two = sc.nextInt();
System.out.print("Enter number of 1 coins: ");
int one = sc.nextInt();      
int total = (ten * 10) + (five * 5) + (two * 2) + (one * 1);
 System.out.println("Total amount in piggy bank:" + total);     
 }
}
