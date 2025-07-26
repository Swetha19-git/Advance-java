import java.util.Scanner;
 class EBill {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
System.out.print("Enter number of units : ");
int units = sc.nextInt();

 double amount = 0;
 if (units <= 200) {
 amount = units * 0.80;
 } else if (units <= 300) {
 amount = (200 * 0.80) + ((units - 200) * 0.90);
 } else {
 amount = (200 * 0.80) + (100 * 0.90) + ((units - 300) * 1.00);
}
 amount += 100;

 if (amount > 400) {
 double charge = amount * 0.15;
 amount =amount + charge;
 }
 System.out.printf("Total Bill Amount:" + amount);

}
}
