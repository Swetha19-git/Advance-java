import java.util.Scanner;
 class year_convert{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of days: ");
int Days = sc.nextInt();
int years = Days / 365;
int remainingdays= Days % 365;

 int months = remainingdays / 30;
 int days = remainingdays % 30;

    
 System.out.println(years + " year");
 System.out.println(months + " months");
 System.out.println(days + " days");

    }
}
