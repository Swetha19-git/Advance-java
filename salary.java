import java.util.*;
class salary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of working day:");
int days=sc.nextInt();
int monthly_salary= 30000;
int perday_salary=30000/30;
int total_salary = days* perday_salary;
System.out.println("your number of working day is" + days);
System.out.println("your total salary is" + total_salary);
}
}
